package com.aayush.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcore/set/setconfig.xml");
		
		CarDealer dealer = (CarDealer) ctx.getBean("dealer");
		
		System.out.println(dealer.getName());
		System.out.println(dealer.getModels());

	}

}
