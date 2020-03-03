package com.martinloyd.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martinloyd.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
