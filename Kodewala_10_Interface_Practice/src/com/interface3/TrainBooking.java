package com.interface3;

public class TrainBooking implements IBooking {

	@Override
	public void cancleBooking() {

		System.out.println("TrainBooking.cancleBooking()");

	}

	@Override
	public void chackStatus() {
		System.out.println("TrainBooking.chackStatus()");

	}

	@Override
	public SearchResult search() {

		System.out.println("TrainBooking.search()");
		return null;
	}

	// only one override to the parent
	@Override
	public void autoUpgarde() {
		System.out.println("TrainBooking.autoUpgarde()..........");

		System.out.println("Train Number: 12345");
		System.out.println("Train Name: Rajdhani Express");
		System.out.println("Passenger Name: GK Ranjan");
		System.out.println("Source Station: New Delhi");
		System.out.println("Destination Station: Mumbai");
		System.out.println("Ticket Price: 2500.00");
		System.out.println("Coach Type: AC First Class");

	}

	@Override
	public Booking bookingStatus() {

		
		return null;
	}

}
