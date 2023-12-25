package com.aayush.spring.springmvcorm.user.dao;

import java.util.List;

import com.aayush.spring.springmvcorm.user.entity.User;

public interface UserDao {

	int create(User user);

	int update(User user);

	void delete(int id);

	User read(int id);

	List<User> load();
}
