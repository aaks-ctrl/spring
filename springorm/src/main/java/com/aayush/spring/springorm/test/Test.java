package com.aayush.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aayush.spring.springorm.dao.ProductDao;
import com.aayush.spring.springorm.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springorm/test/config.xml");
		ProductDao product = (ProductDao) ctx.getBean("productDao");
		
		Product newProduct = new Product();
		newProduct.setId(1);
		newProduct.setName("Pen");
		newProduct.setPrice(7.00);
		newProduct.setDescription("pen for writing");
//		product.create(newProduct);
		System.out.println(product.fetchAll());
	}

}
