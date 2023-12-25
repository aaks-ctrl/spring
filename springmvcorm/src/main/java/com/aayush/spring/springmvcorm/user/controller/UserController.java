package com.aayush.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aayush.spring.springmvcorm.user.entity.User;
import com.aayush.spring.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping("registrationPage")
	public String showRegPage() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "User created with ID " + result);
		return "userReg";
	}

	@RequestMapping(value = "getUsers")
	public String getUsers(ModelMap model) {
		List<User> users = service.load();
		model.addAttribute("users", users);
		return "displayUsers";
	}
}
