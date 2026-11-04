package com.interfacePractice.polymorphism4;

public class PremiumCustomer extends Customer {
	
	@Override
	double calculateDiscount(double amount)
	{
		return amount *0.15;
	}
}
