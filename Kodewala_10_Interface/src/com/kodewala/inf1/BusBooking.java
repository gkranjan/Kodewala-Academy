package com.kodewala.inf1;

public class BusBooking implements IDiscount{

	@Override
	public int calculateDiscount(int amount, int rate) {
		
		int finalAmount = amount - (amount * rate)/100;

		System.out.println("BusBooking.calculateDiscount()" + finalAmount);
		return finalAmount;
	}

	@Override
	public void calaculateDiscountTax(int Tax) {

		System.out.println("BusBooking.calaculateDiscountTax()");
	}
	
	

}
