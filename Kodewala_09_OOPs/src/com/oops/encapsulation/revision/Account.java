package com.oops.encapsulation.revision;

public class Account {

	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	// this method will modify the balance
	public void credit(int amount) {

		// check the balance of sender
		checkBalance();
		
		// check the pin of sender
		validatePin("e896");
		//getBalance();
		// debit the amount
		// credit the amount--->0---->100

		balance += amount;

		System.out.println("Your credited balance is: " + amount + " Total balance is:" + balance);
	}
	
	private int checkBalance()
	{
		System.out.println("Account .checkBalance()");
		return 2000;
	}
	
	private boolean validatePin(String userId)
	{
		
		System.out.println("Account.validatePin()");
		return true;
	}
	
	private void  getBalance()
	{
		System.out.println("Your total balance is:"+balance);
	}
	
	

}
