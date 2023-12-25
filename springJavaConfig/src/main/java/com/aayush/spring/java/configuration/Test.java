package com.aayush.spring.java.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aayush.spring.java.configuration.dao.Dao;
import com.aayush.spring.java.configuration.service.config.ServiceConfig;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfig.class);
		Dao bean = (Dao) ctx.getBean(Dao.class);
		bean.create();
		ctx.close();
	}

}
