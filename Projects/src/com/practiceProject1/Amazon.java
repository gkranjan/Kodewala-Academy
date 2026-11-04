package com.practiceProject1;

public class Amazon extends Flipkart {
	String name;
	String email;
	String phone;

	public void userInput(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public void printDetails() {
		System.out.println(name + " " + email + " " + phone);
	}

}
