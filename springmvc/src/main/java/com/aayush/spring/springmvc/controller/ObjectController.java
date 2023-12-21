package com.aayush.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aayush.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee emp = new Employee();
		emp.setId(1234);
		emp.setName("John");
		emp.setSalary(20000.00);

		modelAndView.addObject("emp", emp);

		return modelAndView;

	}
}
