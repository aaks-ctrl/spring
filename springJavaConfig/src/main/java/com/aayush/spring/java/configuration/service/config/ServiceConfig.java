package com.aayush.spring.java.configuration.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.aayush.spring.java.configuration.dao.Dao;
import com.aayush.spring.java.configuration.dao.config.DaoConfig;
import com.aayush.spring.java.configuration.service.Service;

@Configuration
@Import(DaoConfig.class)
public class ServiceConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Service service() {
		return new Service();
	}

}
