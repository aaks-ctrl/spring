package com.aayush.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside orderBO");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
