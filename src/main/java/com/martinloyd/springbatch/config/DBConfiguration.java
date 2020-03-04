package com.martinloyd.springbatch.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class DBConfiguration {

	@Lazy
	@Autowired
	private DataSource dataSource;
	@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource ds() {
		return DataSourceBuilder.create().build();
	}
}