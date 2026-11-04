package com.oops.polymorphism.attachived;

public class Patna extends HDFCBank{
	
	@Override
	public void branch()
	{
		System.out.println("HDFCBank.branch()....Patna");
	}
	
	@Override
	public void savingAccount()
	{
		System.out.println("HDFCBank,Patna,Branch.savingAccount()......");
	}
	
	@Override
	public void currentAccount()
	{
		System.out.println("HDFCBank,Patna,Branch.currentAccount()....");
	}
	
	@Override
	public void joinedAccount()
	{
	
		System.out.println("HDFCBank,Patna,Branch.joinedAccount()....");
	}

}
