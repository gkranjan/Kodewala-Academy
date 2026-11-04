package com.oops.polymorphism.attachived;

public class Mumbai extends HDFCBank{
	
	@Override
	public void branch()
	{
		System.out.println("HDFCBank.branch()....Mumbai");
	}
	
	@Override
	public void savingAccount()
	{
		System.out.println("HDFCBank,Mumbai,Branch.savingAccount()....");
	}
	
	@Override
	public void currentAccount()
	{
		System.out.println("HDFCBank,Mumbai,Branch.currentAccount()....");
	}
	
	@Override
	public void joinedAccount()
	{
	
		System.out.println("HDFCBank,Mumbai,Branch.joinedAccount()....");
	}
	

}
