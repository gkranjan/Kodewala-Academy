package com.interfacePractice.polymorphism;

public class Driver {

	public static void main(String[] args) {

		
		PaaymentProcessor processor=new PaaymentProcessor();
		
		Payment payment =new CreditCardPayment();
		processor.processPayment(payment,25000);
		
		payment=new UPIPayment();
		processor.processPayment(payment, 15000);
	}

}
