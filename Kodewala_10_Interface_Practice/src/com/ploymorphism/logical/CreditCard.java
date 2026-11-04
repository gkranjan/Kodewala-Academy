package com.ploymorphism.logical;

public class CreditCard extends Payment {
	
	@Override
	public double calculateCharge(double amount)
	{
		return amount * 0.02;
	}


}
