package com.interface3;

public class SearchResult implements IBooking {

	@Override
	public void cancleBooking() {
		System.out.println("SearchResult.cancleBooking()");

	}

	@Override
	public void chackStatus() {
		System.out.println("SearchResult.chackStatus()");

	}

	@Override
	public SearchResult search() {
		System.out.println("SearchResult.search()");

		return null;
	}

	@Override
	public Booking bookingStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
