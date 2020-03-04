package com.martinloyd.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinloyd.springbatch.model.DHS;

public interface DHSRepository extends JpaRepository<DHS, Integer> {
}
