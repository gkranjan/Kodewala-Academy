package com.funtionalInterface6;

public class PaymentService {

	public static void main(String[] args) {

		Payment upi = amount -> 
		System.out.println("UPI Payment: " +amount);
		
		Payment card = amount -> 
		System.out.println("Card Payment: " +amount);
		
		Payment netBanking = amount -> 
		System.out.println("Net Banking Payment: " +amount);
		
		upi.processPayment(2500);
		card.processPayment(5000);
		netBanking.processPayment(10000);
	}

}
