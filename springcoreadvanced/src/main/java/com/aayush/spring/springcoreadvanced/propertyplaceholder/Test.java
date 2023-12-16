package com.aayush.spring.springcoreadvanced.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aayush/spring/springcoreadvanced/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) context.getBean("MyDAO");
		System.out.println(dao);

	}
}
