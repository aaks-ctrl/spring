package com.aayush.spring.springcore.constructorinjection;

public class Address {

	private int hNumber;
	private String street;
	private String city;

	public int gethNumber() {
		return hNumber;
	}

	public void sethNumber(int hNumber) {
		this.hNumber = hNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hNumber=" + hNumber + ", street=" + street + ", city=" + city + "]";
	}
	

}
