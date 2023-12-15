package com.aayush.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcore/list/listconfig.xml");
		
		Hospital hosp = (Hospital) ctx.getBean("hospital");
		
		System.out.println(hosp.getName());
		System.out.println(hosp.getDepartments());
		System.out.println(hosp.getDepartments().getClass());

	}

}
