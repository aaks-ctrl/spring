package com.aayush.spring.springaop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aayush.spring.springaop.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/aayush/spring/springaop/test/config.xml");

		ProductService prod = (ProductService) ctx.getBean("productService");
		prod.multiply(4, 2);
	}

}
