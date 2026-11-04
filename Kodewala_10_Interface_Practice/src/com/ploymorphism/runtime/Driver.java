package com.ploymorphism.runtime;

public class Driver {

	public static void main(String[] args) {

		PaymentProcessor processor = new PaymentProcessor();
		
		Payment payment = new CreditCard();
		processor.process(payment, 2500);
		
		payment = new UPI();
		processor.process(payment, 15000);
		
		payment = new NetBanking();
		processor.process(payment, 3000);
	}

}
