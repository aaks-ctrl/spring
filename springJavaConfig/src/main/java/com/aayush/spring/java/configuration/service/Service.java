package com.aayush.spring.java.configuration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.aayush.spring.java.configuration.dao.Dao;

public class Service {
	@Autowired
	Dao dao;

	public void save() {
		dao.create();
	}

	public void init() {
		System.out.println("init()");
	}

	public void destroy() {
		System.out.println("destroy()");
	}
}
