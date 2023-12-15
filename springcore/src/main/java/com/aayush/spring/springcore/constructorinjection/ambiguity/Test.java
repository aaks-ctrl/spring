package com.aayush.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition add = (Addition) ctx.getBean("addition");
		System.out.println(add);

	}

}
