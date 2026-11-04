package com.interfacePractice.polymorphism;

public class PaaymentProcessor {
	
	public void processPayment(Payment payment,double amount)
	{
		payment.pay(amount);
	}

}
