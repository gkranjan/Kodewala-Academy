package com.interfacePractice.polymorphism5;

public class Driver {

	public static void main(String[] args) {

		RideService service = new RideService();
		
		service.bookRide(new BikeRide(), 10);
		service.bookRide(new CarRide(), 10);
		
	}

}
