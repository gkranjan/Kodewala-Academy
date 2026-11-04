package com.oops.polymorphism.attachived;

public class Jharkhand extends HDFCBank{
	
	
	@Override
	public void branch()
	{
		System.out.println("HDFCBank.branch()....Jharkhand");
	}
	
	@Override
	public void savingAccount()
	{
		System.out.println("HDFCBank,Jharkhand,Branch.savingAccount()....");
	}
	
	@Override
	public void currentAccount()
	{
		System.out.println("HDFCBank,Jharkhand,Branch.currentAccount()....");
	}
	
	@Override
	public void joinedAccount()
	{
	
		System.out.println("HDFCBank,Jharkhand,Branch.joinedAccount()....");
	}

}
