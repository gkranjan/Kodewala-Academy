package com.interface3;

public class Driver {

	public static void main(String[] args) {
		
		BookingProcess redirect=new BookingProcess();
		//redirect.processing(new TrainBooking());
		//redirect.processing(new FlightBooking());
		redirect.processing(new BusBooking());
		
		
		
		
		

	}

}
