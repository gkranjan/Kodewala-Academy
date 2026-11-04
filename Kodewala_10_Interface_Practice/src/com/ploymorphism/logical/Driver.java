package com.ploymorphism.logical;

public class Driver {

	public static void main(String[] args) {
/**
 * amount is inslized this type.
 */
		double amount =5000;
		
		/**
		 * create this type of object.
		 */
		Payment payment;
		
		payment =new UPI();
		double charge = payment.calculateCharge(amount);
		System.out.println("UPI Final Amount: Rs. " +(amount+charge));
		
		/**
		 * create object like this.and like this pass the values.
		 */
		payment =new CreditCard();
		charge = payment.calculateCharge(amount);
		System.out.println("Card Final Amount: Rs. " +(amount+charge));
		
		
		payment =new NetBanking();
		charge = payment.calculateCharge(amount);
		System.out.println("NetBanking Final Amount: Rs. " +(amount+charge));
		
		
		
	}

}
