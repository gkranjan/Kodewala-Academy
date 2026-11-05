package com.order.model;

public class Address implements Cloneable {

	private String city;
	private String state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println("City: " + city);
		System.out.println("State: " + state);
	}

}
