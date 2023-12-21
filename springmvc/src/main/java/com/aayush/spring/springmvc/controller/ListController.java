package com.aayush.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aayush.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee emp1 = new Employee();
		emp1.setId(1234);
		emp1.setName("John");
		emp1.setSalary(200300.00);

		Employee emp2 = new Employee();
		emp2.setId(123);
		emp2.setName("Won");
		emp2.setSalary(200200.00);

		Employee emp3 = new Employee();
		emp3.setId(12);
		emp3.setName("Newman");
		emp3.setSalary(200100.00);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		modelAndView.addObject("empList", empList);

		return modelAndView;

	}
}
