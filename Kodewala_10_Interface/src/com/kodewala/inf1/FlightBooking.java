package com.kodewala.inf1;

// extends object .is already present here 
public class FlightBooking  implements IDiscount{

	/**
	 * its only implement of the parent interafce ,
	 */
	@Override
	public int calculateDiscount(int amount, int rate) {
		
		int finalFare = amount -(amount * rate) /100;
		return finalFare;
	}

	@Override
	public void calaculateDiscountTax(int Tax) {

		System.out.println("FlightBooking.calaculateDiscountTax()");
	}
	
	

}
