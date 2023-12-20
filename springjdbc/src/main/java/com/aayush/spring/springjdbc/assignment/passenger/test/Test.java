package com.aayush.spring.springjdbc.assignment.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aayush.spring.springjdbc.assignment.dao.PassengerDao;
import com.aayush.spring.springjdbc.assignment.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/aayush/spring/springjdbc/assignment/passenger/test/config.xml");
		
		PassengerDao pas = (PassengerDao) ctx.getBean("passengerDao");
		int result;
		Passenger tempPass = new Passenger();
		tempPass.setId(2);
		tempPass.setFirstName("Clark");
		tempPass.setLastName("Kent");
		Passenger res = pas.read(4);
		System.out.println("Result : "+res);
	}

}
