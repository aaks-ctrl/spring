package com.aayush.spring.springorm.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.aayush.spring.springorm.dao.ProductDao;
import com.aayush.spring.springorm.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	public Product fetch(int id) {
		return (Product) hibernateTemplate.get(Product.class, id);
	}

	@Override
	public List<Product> fetchAll() {
		return (List<Product>) hibernateTemplate.loadAll(Product.class);
	}

}
