package com.interface1;

public class CardPayment implements IPayment{
	
	@Override
	public void pay(double amount)
	{
		System.out.println("Payment Mode  : Credit Card");
		System.out.println("Amount Paid   : Rs. " +amount);
		System.out.println("Status        : Payment Successful");
	}

}
