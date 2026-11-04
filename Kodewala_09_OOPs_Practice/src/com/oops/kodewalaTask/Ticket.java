package com.oops.kodewalaTask;

public class Ticket {

	String name;
	String email;
	String phoneNumber;

	void bookTicket() {

		System.out.println("I am in the bookTicket method.");
	}

	void bookingDetail(String name, String email, String phoneNumber) {
		System.out.println("Name: " + name + "Email Id: " + email + "PhoneNumber:" + phoneNumber);

	}
}

class RedBus extends Ticket {
	@Override
	void bookTicket() {

		System.out.println("I am in the RedBus method.");
	}

	@Override
	void bookingDetail(String name, String email, String phoneNumber) {
		System.out.println("Name: " + name + "Email Id: " + email + "PhoneNumber:" + phoneNumber);

	}
}

class MakeMyTrip extends Ticket {
	@Override
	void bookTicket() {

		System.out.println("I am in the MakeMyTrip method.");
	}

	@Override
	void bookingDetail(String name, String email, String phoneNumber) {
		System.out.println("Name: " + name + "Email Id: " + email + "PhoneNumber:" + phoneNumber);

	}
}