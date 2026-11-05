package com.bank.model;

public class BankAccount implements Cloneable{
	
	private long accountnumber;
	private String holderName;
	private double balance;
	
	
	public BankAccount(long accountnumber, String holderName, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();	}
	
	public void display()
	{
		System.out.println("Account Number: "+accountnumber);
		System.out.println("Holder Name: "+holderName);
		System.out.println("Balance: " +balance);
	}
	

}
