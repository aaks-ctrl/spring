package com.aayush.spring.springcoreadvanced.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcoreadvanced/autowiring/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);

	}

}
