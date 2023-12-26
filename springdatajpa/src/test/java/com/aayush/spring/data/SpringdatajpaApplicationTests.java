package com.aayush.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.aayush.spring.data.entity.Product;
import com.aayush.spring.data.repository.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		System.out.println("----HELLO-1----");
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		System.out.println("----HELLO-2----");
		Product entity = new Product();
		entity.setId(12L);
		entity.setName("MacBook");
		entity.setDescription("18");
		entity.setPrice(1000d);
		productRepo.save(entity);
		
//		System.out.println(productRepo.findById(1L));
		System.out.println(productRepo.findByName("MacBook"));
	}

}
