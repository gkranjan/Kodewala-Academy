package com.oops.encapsulation3;

public class ATM {
	
	private String pin="123";
	private double balance= 5000;
	
	public void withdraw(double amountToWithdraw,String enterPin)
	{
		
		System.out.println("Current balance Is: " +balance);
		
		if(enterPin.equals(pin) && amountToWithdraw<=balance)
		{
			balance -= amountToWithdraw;
			System.out.println(amountToWithdraw+" Withdraw remaining balance is" +balance);
		}
		else
		{
			System.out.println("PIN mismatch Try again!!! insuficient balance!!");
		}
	}
	
	public void deposit(double amount, String enterPin)
	{
		if(enterPin.equals(pin))
		{
			balance += amount;
			//System.out.println("After deposit:" +balance);
			System.out.println(amount+" Deposited new balance is " +balance);

		}
		
		else
		{
			System.out.println("Try again!! Cann't deposit!! ");
		}
	}
	
	public void display(String name,String accNo)
	{
		System.out.println("Name:" +name);
		System.out.println("Account No:" +accNo);
		System.out.println("Closing balance:" +balance);
	}

}
