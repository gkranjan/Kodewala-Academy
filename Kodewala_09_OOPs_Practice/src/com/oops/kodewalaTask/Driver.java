package com.oops.kodewalaTask;

public class Driver {

	public static void main(String[] args) {

		
		Ticket ticket;
		
		ticket=new RedBus();
		ticket.bookTicket();
		ticket.bookingDetail("Gautam Kumar Ranjan, ","gkranjan24@gmail, ","7014327652");
		
		
		ticket = new MakeMyTrip();
		ticket.bookTicket();
		ticket.bookingDetail("Kumar ,","ranjan2013@gmail.com ,","7014327893");
		
		
		ticket=new Ticket();
		ticket.bookTicket();
		ticket.bookingDetail("Hello ,", "ranjankumar@gmail.com ,", "7014357894");
		
		
	}

}
