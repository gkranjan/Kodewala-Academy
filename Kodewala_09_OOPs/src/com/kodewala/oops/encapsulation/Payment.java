package com.kodewala.oops.encapsulation;

public class Payment {
	
	private int balance;	// Data or Variable-->if use public then other classes can change this variable w/o your permission

	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	
	// setter
	public void doDebit(int _amount)
	{
		
		// modifying the data
		balance = balance- _amount;
	}
	
	public void doCredit(int _amount) // allow to change 
	{
		if(_amount >0)
		{
			// Modifying the data
			balance = balance + _amount;
		}
		else
		{
			System.err.println("give me write amount!!");
		}
	}
	// getter
		public int getBalance()
		{
			return balance;
		}
	

}
