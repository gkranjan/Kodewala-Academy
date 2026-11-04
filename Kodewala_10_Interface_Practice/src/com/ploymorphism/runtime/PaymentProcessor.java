package com.ploymorphism.runtime;

public class PaymentProcessor {
	
	public void process(Payment payment,double amount)
	{
		payment.pay(amount);
	}

}
