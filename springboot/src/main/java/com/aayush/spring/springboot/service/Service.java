package com.aayush.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aayush.spring.springboot.dao.Dao;

@Component
public class Service {
	@Autowired
	Dao dao;

	Service(Dao dao) {
		System.out.println("----inside----");
		this.dao = dao;
	}

	public void save() {
		dao.create();
	}

}
