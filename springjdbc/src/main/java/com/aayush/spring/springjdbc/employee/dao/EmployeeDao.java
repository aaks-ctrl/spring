package com.aayush.spring.springjdbc.employee.dao;

import java.util.List;

import com.aayush.spring.springjdbc.employee.entity.Employee;

public interface EmployeeDao {

	int create(Employee emp);

	int update(Employee emp);

	int delete(int id);

	Employee read(int id);
	
	List<Employee> find();
}
