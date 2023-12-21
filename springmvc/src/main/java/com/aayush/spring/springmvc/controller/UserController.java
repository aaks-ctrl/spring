package com.aayush.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aayush.spring.springmvc.dto.User;

@Controller
public class UserController {

	User user = new User();

	@RequestMapping("registrationPage")
	public ModelAndView showRegPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}

	@RequestMapping("user")
	public ModelAndView userDetails() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result");
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		this.user = user;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result");
		return modelAndView;
	}

}
