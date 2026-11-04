package com.oops.abstraction2;

public class CurrentAccount extends Account{
	
	CurrentAccount(double balance)
	{
		super(balance);
	}
	
	@Override
	void calculateInterest()
	{
		System.out.println("No interest for Current Account.");
	}

}
