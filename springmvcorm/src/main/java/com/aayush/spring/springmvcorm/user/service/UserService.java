package com.aayush.spring.springmvcorm.user.service;

import java.util.List;

import com.aayush.spring.springmvcorm.user.entity.User;

public interface UserService {
	int save(User user);

	List<User> load();

	User getUser(Integer id);
}
