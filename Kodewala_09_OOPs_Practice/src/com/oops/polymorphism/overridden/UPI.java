package com.oops.polymorphism.overridden;

/**
 * Child class - UPI Payment
 */
public class UPI extends Payment {
	
	@Override
	void processPayment(double amount)
	{
		System.out.println("Processing UPI payment of "+amount);
	}

}
