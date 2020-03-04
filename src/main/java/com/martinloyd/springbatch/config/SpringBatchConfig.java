package com.martinloyd.springbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.martinloyd.springbatch.model.DHS;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory,
                   StepBuilderFactory stepBuilderFactory,
                   ItemReader<DHS> itemReader,
                   ItemProcessor<DHS, DHS> itemProcessor,
                   ItemWriter<DHS> itemWriter
    ) {

        Step step = stepBuilderFactory.get("ETL-file-load")
                .<DHS, DHS>chunk(100)
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
    public FlatFileItemReader<DHS> itemReader() {
    
        FlatFileItemReader<DHS> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(new FileSystemResource("src/main/resources/APFS1.csv"));
        flatFileItemReader.setName("CSV-Reader");
        flatFileItemReader.setLinesToSkip(1);
        flatFileItemReader.setLineMapper(lineMapper());
        return flatFileItemReader;
    }

    @Bean
    public LineMapper<DHS> lineMapper() {

        DefaultLineMapper<DHS> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();

        lineTokenizer.setDelimiter(",");
       // lineTokenizer.setIncludedFields(1);
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames(new String[]{"listing_id", 	"title",	"description", 	"agency", 	"organization", "region", 	"pop_city", 	"pop_state", 	"pop_country", 	"naics_code", 	"requirement_type", "base_all_options", 	"base_all_options_value", 	"award_status", 	"est_contract_value_min",	"est_contract_value_max", 	"task_del_order_dollar_amount", 	"current_fy_proj_obl", 	"fund_source", 	"est_award_fiscal_quarter",	"est_award_fiscal_year", 	"est_solicitation_date",	"link_to_solicitation", 	"period_of_perform_start", 	"period_of_perform_end","ultimate_completion_date", "current_completion_date", "acquisition_strategy_type", "contract_type", "procurement_method","extent_competed", 	"contractor_name", 	"awarded_contract_order", 	"type_of_awardee", 	"award_type", 	"listing_manager_email", 	"point_of_contact_name", 	"point_of_contact_email", 	"small_bus_specialist", "additional_info", 	"last_modified_date","published","poc_phone","data_source"});

        BeanWrapperFieldSetMapper<DHS> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(DHS.class);

        defaultLineMapper.setLineTokenizer(lineTokenizer);
        defaultLineMapper.setFieldSetMapper(fieldSetMapper);

        return defaultLineMapper;
    }

}
