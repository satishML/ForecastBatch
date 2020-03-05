package com.martinloyd.springbatch.batch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.martinloyd.springbatch.model.FederalForecastEntity;

@Component
public class DHSProcessor implements ItemProcessor<FederalForecastEntity, FederalForecastEntity> {

    private static List<String> listOfIds = new ArrayList<>();
    
    @Autowired 
    public DHSProcessor(JdbcTemplate jdbcTemplate) {
    	listOfIds = jdbcTemplate.queryForList("select listing_id from crm.federal_forecast_test where listing_id is not null", String.class);
    }

    @Override
    public FederalForecastEntity process(FederalForecastEntity federalForecastEntity) throws Exception {
        /*String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        user.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));*/
    	if (listOfIds.contains(federalForecastEntity.getListing_id()))
    		return null;
    	else
    	   return federalForecastEntity;
    }
}
