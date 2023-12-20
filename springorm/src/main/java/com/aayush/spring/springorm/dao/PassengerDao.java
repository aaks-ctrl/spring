package com.aayush.spring.springorm.dao;

import com.aayush.spring.springorm.entity.Passenger;

public interface PassengerDao {

	int create(Passenger pas);

	void update(Passenger pas);

	void delete(Passenger pas);

	Passenger read(int id);
}
