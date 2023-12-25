package com.aayush.spring.java.configuration.dao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aayush.spring.java.configuration.dao.Dao;
import com.aayush.spring.java.configuration.service.Service;

@Configuration
public class DaoConfig {

	@Bean
	public Dao dao() {
		return new Dao();
	}
}
