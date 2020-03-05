package com.martinloyd.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.martinloyd.springbatch.model.FederalForecastEntity;
import com.martinloyd.springbatch.repository.FederalForecastRepository;

@Component
public class DBWriter implements ItemWriter<FederalForecastEntity> {

    @Autowired
    private FederalForecastRepository federalRepository;
    
    

    @Override
    public void write(List<? extends FederalForecastEntity> federalForecastEntityList) throws Exception {
        
        if (federalForecastEntityList.size() > 0)   
        	federalRepository.saveAll(federalForecastEntityList);
      
        }
}
