package com.ploymorphism.runtime;

public class NetBanking extends Payment{

	@Override
	public void pay(double amount)
	{
		System.out.println("Net Banking: Rs. " +amount);
		//System.out.println("Hello");
	}
}
