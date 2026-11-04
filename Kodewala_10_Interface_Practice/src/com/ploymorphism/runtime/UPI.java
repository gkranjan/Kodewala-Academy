package com.ploymorphism.runtime;

public class UPI extends Payment {
	
	@Override
	public void pay(double amount)
	{
		System.out.println("UPI payment: Rs. " +amount);
	}
}
