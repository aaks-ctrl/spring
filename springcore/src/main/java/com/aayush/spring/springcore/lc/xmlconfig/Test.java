package com.aayush.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcore/lc/xmlconfig/config.xml");
		
		Patient patient = (Patient) ctx.getBean("patient");
		
		System.out.println(patient);
		ctx.registerShutdownHook();  // to make sure that the destroy life cycle method is invoked
	}

}
