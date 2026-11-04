package com.oops.polymorphism.attachived;

public class Bangalore extends HDFCBank{
	
	@Override
	public void branch()
	{
		System.out.println("HDFCBank.branch()....Bangalore");
	}
	
	@Override
	public void savingAccount()
	{
		System.out.println("HDFCBank,Bangalore,Branch.savingAccount().....");
	}
	
	@Override
	public void currentAccount()
	{
		System.out.println("HDFCBank,Bangalore,Branch.currentAccount()....");
	}
	
	@Override
	public void joinedAccount()
	{
	
		System.out.println("HDFCBank,Bangalore,Branch.joinedAccount()....");
	}

}
