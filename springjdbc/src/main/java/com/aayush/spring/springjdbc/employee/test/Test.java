package com.aayush.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aayush.spring.springjdbc.employee.dao.EmployeeDao;
import com.aayush.spring.springjdbc.employee.entity.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/aayush/spring/springjdbc/employee/test/config.xml");
		EmployeeDao emp = (EmployeeDao) ctx.getBean("employeeDao");
		String sql = "insert into employee values(?,?,?)";
		Employee emp2 = new Employee();
		emp2.setFirstName("Martha");
		emp2.setId(2);
		emp2.setLastName("Wayne");
// 		int result = emp.create(emp2);
//		int result = emp.update(emp2);
//		int result = emp.delete(1);
		Employee employee = emp.read(1);
		List<Employee> empList = emp.find();
		System.out.println("Number of records inserted are: " + employee);

	}
}