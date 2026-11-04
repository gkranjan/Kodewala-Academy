package com.oops.polymorphism.overridden;

/**
 * Child Class -Credit Card Payment
 */

public class CCPay extends Payment{
	
	@Override
	void processPayment(double amount)
	{
		System.out.println("Processing Credit card payment of " +amount);
	}

}
