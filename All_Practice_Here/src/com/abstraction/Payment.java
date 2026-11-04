package com.abstraction;

abstract class Payment {
	
		abstract void pay(double amount);
}

class UPI extends Payment
{
	void pay(double amount)
	{
		System.out.println("Paid Rs. " +amount+ " Using UPI");
	}
}

class Card extends UPI
{
	
	void Pay(double amount)
	{
		
		System.out.println("Paid Rs. " +amount+ " Using Card");
	}
}


