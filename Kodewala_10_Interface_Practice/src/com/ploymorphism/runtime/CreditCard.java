package com.ploymorphism.runtime;

public class CreditCard extends Payment{
	
	@Override
	public void pay(double amount)
	{
		System.out.println("Credit card Payment: Rs. " +amount);
	}
	

}
