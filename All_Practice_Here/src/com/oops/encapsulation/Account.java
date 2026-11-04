package com.oops.encapsulation;

public class Account {
	
	private String holderName;
	private String accouuntNumber;
	private double balance;
	
	
	public Account(String holderName, String accouuntNumber, double balance) {
		super();
		this.holderName = holderName;
		this.accouuntNumber = accouuntNumber;
		this.balance = balance;
	}
	
	public double getBalance()
	{

		System.out.println("Account opening balance is:"+balance);
		return balance;
		
	}
	public void getcredit(int amount)
	{
		balance += amount;
		System.out.println("Credit balance:" +amount);
	}
	
	public void withdraw(int amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance -= amount;
			System.out.println("Debited balance:" +amount);
		}
		else
		{
			System.out.println("insuficient balance!!");
			
		}	
	}
	
	public void displayUserDetails()
	{
		System.out.println("Account holder name:" +holderName);
		System.out.println("Account number:" +accouuntNumber);
		System.out.println("Total balance after closing:" +balance);
	}
	
	
	

}
