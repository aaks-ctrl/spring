package com.aayush.spring.springmvcorm.user.service.impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aayush.spring.springmvcorm.user.dao.UserDao;
import com.aayush.spring.springmvcorm.user.entity.User;
import com.aayush.spring.springmvcorm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> load() {
		List<User> users = dao.load();
		Collections.sort(users);
		return users;
	}
}
