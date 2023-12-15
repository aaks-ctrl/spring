package com.aayush.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/aayush/spring/springcore/properties/propertiesconfig.xml");
		
		CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) ctx.getBean("countriesandlanguages");
		
		System.out.println(countriesAndLanguages.getCountryAndLanguages());
	}

}
