package com.aayush.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	Employee(Address address) {
		this.address = address;
	}

	@Autowired
	@Qualifier("address123")
	private Address address;

	public Address getAddress() {
		return address;
	}

	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
