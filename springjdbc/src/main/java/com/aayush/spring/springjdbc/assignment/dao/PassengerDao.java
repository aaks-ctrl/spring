package com.aayush.spring.springjdbc.assignment.dao;

import com.aayush.spring.springjdbc.assignment.entity.Passenger;

public interface PassengerDao {

	int create(Passenger pas);

	int update(Passenger pas);

	int delete(int id);

	Passenger read(int id);
}
