package com.martinloyd.springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.martinloyd" })
@EnableJpaRepositories(basePackages = "com.martinloyd")
public class SpringBatchExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchExample1Application.class, args);
	}
}
