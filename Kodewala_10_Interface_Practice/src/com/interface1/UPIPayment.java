package com.interface1;

public class UPIPayment implements IPayment{

	@Override
	public void pay(double amount)
	{
		System.out.println("Payment Mode : UPI");
		System.out.println("Amount Paid  : Rs. " +amount);
		System.out.println("Status       : Payment sucessful");
	}
}
