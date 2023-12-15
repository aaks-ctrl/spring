package com.aayush.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside Hi Method");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye Method");
	}
}
