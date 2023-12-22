package com.aayush.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aayush.spring.springmvc.dto.User;

@Controller
public class UserController {

	User user = new User();

	@RequestMapping("registrationPage")
	public String showRegPage() {
		return "userReg";
	}

	@RequestMapping("user")
	public String userDetails(ModelMap model) {
		model.addAttribute("user", user);
		return "result";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		this.user = user;
		model.addAttribute("user", user);
		return "result";
	}

}
