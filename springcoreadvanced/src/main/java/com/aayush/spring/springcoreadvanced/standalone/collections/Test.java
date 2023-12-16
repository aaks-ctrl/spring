package com.aayush.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcoreadvanced/standalone/collections//config.xml");
		ProductList pList = (ProductList) ctx.getBean("products");
		System.out.println(pList);

	}

}
