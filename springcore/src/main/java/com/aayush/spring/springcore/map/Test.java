package com.aayush.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcore/map/mapconfig.xml");
		
		Customer customer = (Customer) ctx.getBean("customer");
		
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
		System.out.println(customer.toString());

	}

}
