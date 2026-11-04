package com.oops.interface2;

public class CurrentAccount implements BankAccount{
	
	private double balance;
	public CurrentAccount(double balance)
	{
		this.balance=balance;
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited " +amount+ "in Current Account.New Balance: " +balance);
	}
	@Override
	public void withdraw(double amount)
	{
		balance -= amount;
		System.out.println("Withdraw " +amount+ " from current Account.New Balance: " +balance);
	}
	
	@Override
	public double checkBalance()
	{
		return balance;
	}
	
	

}
