package com.aayush.spring.springaop.service.impl;

import com.aayush.spring.springaop.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		System.out.println(num1*num2);
		return num1 * num2;
	}

}
