package com.interface1;

public class CashOnDelivery implements IPayment{
	
	@Override
	public void pay(double amount)
	{
		System.out.println("Payment mode  : Cash on Delivery");
		System.out.println("Amount Due    : Rs. " +amount);
		System.out.println("Status        : Pay on Delivery");
	}

}
