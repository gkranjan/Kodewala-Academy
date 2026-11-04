package com.oops.polymorphism.attachived;

public class Delhi extends HDFCBank{
	
	@Override
	public void branch()
	{
		System.out.println("HDFCBank.branch()....Delhi");
	}
	
	@Override
	public void savingAccount()
	{
		System.out.println("HDFCBank,Delhi,Branch.savingAccount()....");
	}
	
	@Override
	public void currentAccount()
	{
		System.out.println("HDFCBank,Delhi,Branch.currentAccount()....");
	}
	
	@Override
	public void joinedAccount()
	{
	
		System.out.println("HDFCBank,Delhi,Branch.joinedAccount()....");
	}

}
