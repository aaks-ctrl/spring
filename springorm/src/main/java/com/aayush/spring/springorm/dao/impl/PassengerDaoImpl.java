package com.aayush.spring.springorm.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.aayush.spring.springorm.dao.PassengerDao;
import com.aayush.spring.springorm.entity.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Passenger pas) {
		return (Integer) hibernateTemplate.save(pas);
	}

	@Override
	@Transactional
	public void update(Passenger pas) {
		hibernateTemplate.update(pas);
	}

	@Override
	@Transactional
	public void delete(Passenger pas) {
		hibernateTemplate.delete(pas);
	}

	@Override
	public Passenger read(int id) {
		return (Passenger) hibernateTemplate.get(Passenger.class, id);
	}
}
