package com.aayush.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aayush.spring.springorm.dao.PassengerDao;
import com.aayush.spring.springorm.dao.ProductDao;
import com.aayush.spring.springorm.entity.Passenger;
import com.aayush.spring.springorm.entity.Product;

public class PassengerTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springorm/test/config.xml");
		
		PassengerDao passenger = (PassengerDao) ctx.getBean("passengerDao");

		Passenger newPassenger = new Passenger();
		newPassenger.setId(2);
		newPassenger.setFirstName("Stuart");
		newPassenger.setLastName("Stark");
		System.out.println(passenger.read(1));
		
	}

}
