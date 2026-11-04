package com.interface3;

public class BusBooking implements IBooking{

	@Override
	public void cancleBooking() {
		System.out.println("BusBooking.cancleBooking()");
		
	}

	@Override
	public void chackStatus() {
		System.out.println("BusBooking.chackStatus()");
		
	}

	@Override
	public SearchResult search() {
		System.out.println("BusBooking.search()");
		return null;
	}

	@Override
	public Booking bookingStatus() {
		Booking booking=new Booking();
		booking.setBookingId("01");
		booking.getPassangerName("Gautam");
		booking.getSource("Bangalore");
		booking.getDestination("Bihar");
		booking.getTicketPrice(52456.23);
		booking.getPaymentStatus("Successfull");
		booking.getSeatNumber("Upper Bearth,01");
		booking.getStatus("CONFIRM");
		
		return null;
	}

}
