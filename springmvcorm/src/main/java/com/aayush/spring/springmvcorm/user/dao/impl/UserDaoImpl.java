package com.aayush.spring.springmvcorm.user.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aayush.spring.springmvcorm.user.dao.UserDao;
import com.aayush.spring.springmvcorm.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		return (Integer) hibernateTemplate.save(user);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> load() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User userExists(int id) {
		return hibernateTemplate.get(User.class, id);
	}

}
