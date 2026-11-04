package com.interface3;

public class FlightBooking implements IBooking{

	@Override
	public void cancleBooking() {
		System.out.println("FlightBooking.cancleBooking()");
		
	}

	@Override
	public void chackStatus() {
		System.out.println("FlightBooking.chackStatus()");
		
	}

	@Override
	public SearchResult search() {
		System.out.println("FlightBooking.search()");
		return null;
	}
	
	
	// override to the parent
	@Override
	public void autoCancel()
	{
		System.out.println("FlightBooking.autoCancel()");
	}

	@Override
	public Booking bookingStatus() {

		
		return null;
	}

}
