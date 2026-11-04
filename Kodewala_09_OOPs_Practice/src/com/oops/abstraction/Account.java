package com.oops.abstraction;

public class Account {

	public void checkDetails(String name,String bankName,String pan)
	{
		userAccount();
		checkPan(pan);
		display(name, bankName, pan);
		
		
	}
	
	public boolean userAccount()
	{
		System.out.println("user Account!!!!!....check details!!!");
		return true;
		
	}
	
	public  boolean checkPan(String pan)
	{
		System.out.println("Check pan account!!!!");
		System.out.println(pan);
		return true;
	}
	
	public void display(String name,String bankName,String pan)
	{
		System.out.println("Name: " +name);
		System.out.println("BankName: " + bankName);
		System.out.println("Pan Card " +pan);
	}
}
