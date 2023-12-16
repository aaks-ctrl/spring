package com.aayush.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductList {

	private List<String> productName;

	public List<String> getProductName() {
		return productName;
	}

	public void setProductName(List<String> productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductList [productName=" + productName + "]";
	}
	
	
}
