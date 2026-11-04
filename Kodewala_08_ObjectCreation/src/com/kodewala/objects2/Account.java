package com.kodewala.objects2;

class AccountMgmt
{
	
	public AccountMgmt()
	{
	System.out.println("AccountMgmt. AcoountMgmt...");
	}
	
	{
		System.out.println("Hello");
	}
}

public class Account extends AccountMgmt {

	String accountNumber;
	// Instance Init Block --> this will get executed whenever object is created.
	
	{
		System.out.println("Account IIB");
	}
	
	public Account(String accountNumber)
	{
		super();
		//call to init block --> IIb-->2nd line
		
		System.out.println("Account String");
		this.accountNumber=accountNumber;
	}
}
