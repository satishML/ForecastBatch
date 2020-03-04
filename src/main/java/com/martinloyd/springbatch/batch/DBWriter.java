package com.martinloyd.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.martinloyd.springbatch.model.DHS;
import com.martinloyd.springbatch.repository.DHSRepository;

@Component
public class DBWriter implements ItemWriter<DHS> {

    @Autowired
    private DHSRepository dhsRepository;
    
    

    @Override
    public void write(List<? extends DHS> dhsList) throws Exception {
    
        dhsRepository.saveAll(dhsList);
    }
}
