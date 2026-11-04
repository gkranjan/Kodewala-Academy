package com.interface3;

public class BookingProcess {
	
	public void processing(IBooking booking)
	{
		//booking.chackStatus();
		//booking.cancleBooking();
		//booking.search();
		//booking.autoUpgarde();
		booking.autoCancel();
		booking.bookingStatus();
								// calling the BusBooking class and then redirect the other class with the help of object Creation.
		
		IBooking.printTicket("Hello", "Gautam");
		
	}

}
