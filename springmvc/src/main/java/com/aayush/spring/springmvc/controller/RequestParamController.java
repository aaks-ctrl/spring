package com.aayush.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam(value="name") String name,
			@RequestParam(value="sal",required=false, defaultValue="1000") double salary) {

		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
		System.out.println("SALARY : " + salary);
		return new ModelAndView("userReg");
	}
}
