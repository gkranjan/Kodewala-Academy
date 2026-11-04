package com.kodewala.controlFlow;

public class Driver {
	
	public static void main(String[] args) {
		
	
	Booking obj = new Booking();
	
	//obj.doBooking("Banka","Bihar",6); // remove command line also be print.
	
	// these types print the pnr and values.
	String pnr = obj.doBooking("Banka","Bihar", 8);
	System.out.println("PNR is " +pnr);
	
	}
}
