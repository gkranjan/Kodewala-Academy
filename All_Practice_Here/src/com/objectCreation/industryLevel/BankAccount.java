package com.objectCreation.industryLevel;

 public class BankAccount {
	
	public int accountNumber;
	public String holderName;
	public double balance;
	
	public  BankAccount(int number,String name,double amount)
	{
		accountNumber =number;
		holderName=name;
		balance=amount;
		
	}
	
	 public void deposit(double amount)
	{
		if (amount >0)
		{
			 balance = balance + amount;
			System.out.println("Deposit successful:");
			System.out.println("Demposit amount is "+balance);
		}
		
		else {
			System.out.println("Invalid one!!");
		}
	}
	
	public  void dispalyBalance()
	{
		System.out.println("Account:" +accountNumber);
		System.out.println("Holder:" +holderName);
		System.out.println("Balance:" +balance);
	}
}
// public  class BankApplication
//{
//	public static void main(String[] args) {
//		
//		System.out.println("enter main"); 
//		
//		BankAccount acc1=new BankAccount(1001,"Gautam",50000);
//		
//		acc1.deposit(20000);
//		acc1.dispalyBalance();
//	}
//}
