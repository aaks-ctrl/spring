package com.aayush.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	public Addition(int a , int b) {
		System.out.println("Inside Constructor INT");
	}
	
	public Addition(double a, double b) {
		System.out.println("Inside constructor Double");
	}
	
	public Addition(String a, String b) {
		System.out.println("Inside constructor String  ");
	}

}
