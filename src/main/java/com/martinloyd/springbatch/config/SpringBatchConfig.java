package com.martinloyd.springbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.martinloyd.springbatch.model.FederalForecastEntity;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory,
                   StepBuilderFactory stepBuilderFactory,
                   ItemReader<FederalForecastEntity> itemReader,
                   ItemProcessor<FederalForecastEntity, FederalForecastEntity> itemProcessor,
                   ItemWriter<FederalForecastEntity> itemWriter
    ) {

        Step step = stepBuilderFactory.get("ETL-file-load")
                .<FederalForecastEntity, FederalForecastEntity>chunk(100)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();


        return jobBuilderFactory.get("ETL-Load")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .build();
    }
    
    @Bean
    @StepScope
    public FlatFileItemReader<FederalForecastEntity> itemReader(@Value("#{jobParameters[filePath]}") String fileName, @Value("#{jobParameters[columns]}") String columns) {
    
        FlatFileItemReader<FederalForecastEntity> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(new FileSystemResource(fileName));
        flatFileItemReader.setName("CSV-Reader");
        flatFileItemReader.setLinesToSkip(1);
       // flatFileItemReader.setLineMapper(lineMapper());
        
        flatFileItemReader.setLineMapper(new DefaultLineMapper<FederalForecastEntity>() {{
            setLineTokenizer(new DelimitedLineTokenizer(",") {{
                setNames(columns.split(","));
                setStrict(false);
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<FederalForecastEntity>() {{
                setTargetType(FederalForecastEntity.class);
                setStrict(false);
            }});
        }});
        return flatFileItemReader;
    }

   /* @Bean
    public LineMapper<FederalForecastEntity> lineMapper() {

        DefaultLineMapper<FederalForecastEntity> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();

        lineTokenizer.setDelimiter(",");
       // lineTokenizer.setIncludedFields(1);
        lineTokenizer.setStrict(false);
       

        BeanWrapperFieldSetMapper<FederalForecastEntity> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(FederalForecastEntity.class);

        defaultLineMapper.setLineTokenizer(lineTokenizer);
        defaultLineMapper.setFieldSetMapper(fieldSetMapper);

        return defaultLineMapper;
    }
*/
}
