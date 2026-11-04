package com.kodewala.controlFlow;

/**
 * This class is responsible for accepting booking from user.
 */
public class Booking 

{
	// More than 6 pax per PNR is not allowed.
	public String doBooking(String from,String to, int noOfPax)
	{
		String pnr = null;
		
		if(noOfPax >6)
		{
			// Don not allow to book
			System.err.println("As per IRCTC policy,only 6 Pax are allowed per PNR");
			
		}
		else 
		{
			// Confirming the Booking
			
			pnr = "5874133688";
			System.out.println("Confirming the booking: " +pnr);
			System.out.println("Status : CONFIRMED");
			System.out.println("SEAT : 23 A1");
			
		}
		
		
		// .....
		// .....
		return pnr;
		
	}

}
