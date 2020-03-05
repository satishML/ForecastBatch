package com.martinloyd.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinloyd.springbatch.model.FederalForecastEntity;

public interface FederalForecastRepository extends JpaRepository<FederalForecastEntity, Integer> {
}
