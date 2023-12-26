package com.aayush.spring.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aayush.spring.data.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByName(String name);
	
}
