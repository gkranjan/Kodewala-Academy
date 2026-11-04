package com.interfacePractice.polymorphism4;

public class RegularCustomer extends Customer {
	
	@Override
	double calculateDiscount(double amount)
	{
		return amount *0.05;
	}

}
