package com.ploymorphism.logical;

public class UPI extends Payment {
	
	@Override
	public double calculateCharge(double amount)
	{
		return amount * 0.01;
	}

}
