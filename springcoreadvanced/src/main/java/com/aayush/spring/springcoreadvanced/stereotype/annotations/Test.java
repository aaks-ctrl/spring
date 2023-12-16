package com.aayush.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor);

	}

}
