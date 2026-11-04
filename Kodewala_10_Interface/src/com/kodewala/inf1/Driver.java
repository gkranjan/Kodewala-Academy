package com.kodewala.inf1;

public class Driver {
	public static void main(String[] args) {
		// cannot create object of interface
		
		IDiscount discount=new BusBooking();
		discount.calculateDiscount(500, 10);
		discount.calaculateDiscountTax(5);
		
		
		IPorpertyTaxDiscount discount1=new PropertTax();
		discount1.calaculateDisc();
		
		//downCasting
		
		FlightBooking fb = (FlightBooking) discount;

		
		
	}

}
