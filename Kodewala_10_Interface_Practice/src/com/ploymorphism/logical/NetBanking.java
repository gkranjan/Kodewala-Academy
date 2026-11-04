package com.ploymorphism.logical;

public class NetBanking  extends Payment{
	
	@Override
	public double calculateCharge(double amount)
	{
		return amount * 0.015;
	}


}
