package com.aayush.spring.springorm.dao;

import java.util.List;

import com.aayush.spring.springorm.entity.Product;

public interface ProductDao {

	int create(Product product);

	void update(Product product);

	void delete(Product product);

	Product fetch(int id);

	List<Product> fetchAll();
}
