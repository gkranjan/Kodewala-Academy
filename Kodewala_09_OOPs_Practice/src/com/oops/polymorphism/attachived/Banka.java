package com.oops.polymorphism.attachived;

public class Banka extends HDFCBank{
	
	@Override
	public void branch()
	{
		System.out.println("HDFCBank.branch()....Banka");
	}
	
	@Override
	public void savingAccount()
	{
		System.out.println("HDFCBank,Banka,Branch.savingAccount()......");
	}
	
	@Override
	public void currentAccount()
	{
		System.out.println("HDFCBank,Banka,Branch.currentAccount()....");
	}
	
	@Override
	public void joinedAccount()
	{
	
		System.out.println("HDFCBank,Banka,Branch.joinedAccount()....");
	}
	

}
