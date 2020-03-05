package com.martinloyd.springbatch.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;

    @GetMapping
    public BatchStatus load() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {


        Map<String, JobParameter> maps = new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        maps.put("filePath",  new JobParameter("src/main/resources/APFS2.csv"));
        maps.put("columns",  new JobParameter("listing_id,title,description,agency,organization,region,pop_city,pop_state,pop_country,naics_code,requirement_type,base_all_options,base_all_options_value,award_status,est_contract_value_min,est_contract_value_max,task_del_order_dollar_amount,current_fy_proj_obl,fund_source,est_award_fiscal_quarter,est_award_fiscal_year,est_solicitation_date,link_to_solicitation,period_of_perform_start,period_of_perform_end,ultimate_completion_date,current_completion_date,acquisition_strategy_type,contract_type,procurement_method,extent_competed,contractor_name,awarded_contract_order,type_of_awardee,award_type,listing_manager_email,point_of_contact_name,point_of_contact_email,small_bus_specialist,additional_info,last_modified_date,published,poc_phone,data_source"));
                
        JobParameters parameters = new JobParameters(maps);
        JobExecution jobExecution = jobLauncher.run(job, parameters);

        System.out.println("JobExecution: " + jobExecution.getStatus());

        System.out.println("Batch is Running...");
        while (jobExecution.isRunning()) {
            System.out.println("...");
        }
        return jobExecution.getStatus();
    }
}
