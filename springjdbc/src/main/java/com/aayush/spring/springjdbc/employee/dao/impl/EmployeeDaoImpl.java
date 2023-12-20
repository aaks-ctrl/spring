package com.aayush.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.aayush.spring.springjdbc.employee.dao.EmployeeDao;
import com.aayush.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.aayush.spring.springjdbc.employee.entity.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Employee emp) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		return jdbcTemplate.update(sql, emp.getFirstName(), emp.getLastName(), emp.getId());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper empRowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, empRowMapper,id);
		System.out.println("Hello "+emp);
		return emp;
	}

	@Override
	public List<Employee> find() {
		String sql = "select * from employee";
		EmployeeRowMapper empRowMapper = new EmployeeRowMapper();
		List<Employee> empList = jdbcTemplate.query(sql, empRowMapper);
		return empList;
	}

}
