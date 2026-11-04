package com.oops.interface2;

public class SavingAccount implements BankAccount{   // SavingAccount is implementing Bankaccount Interface
	
	private double balance;
	
	public SavingAccount(double balance)
	{
		this.balance=balance;
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited " +amount+ "int Saving Account.New Balance: "+balance);
	}
	@Override
	public void withdraw(double amount)
	{
		if(balance - amount >= MIN_BALANCE)
		{
			balance -= amount;
			System.out.println("Withdraw" +amount+ "from Saving Account.New Balance: " +balance);
		}
		else
		{
			System.out.println("Insufficient balance!");
		}
	}
	@Override
	public double checkBalance()
	{
		return balance;
	}

}
