package com.aayush.spring.springcore.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/aayush/spring/springcore/innerbeans/config.xml");

		Employee emp = (Employee) ctx.getBean("emp");

		System.out.println(emp);

		Employee emp1 = (Employee) ctx.getBean("emp");

		System.out.println(emp1);
		
		System.out.println("Is hashcode same = "+ (emp.hashCode() == emp1.hashCode()));
	}

}
