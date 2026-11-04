package com.oops.abstraction2;

abstract class Account {
	
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	abstract void calculateInterest();  //Abstract method (to be implemented by subclass)
	
	void showBalance()
	{
		// Concrete method
		
		
		System.out.println("Current Balance: " +balance);
	}
	
	

}
