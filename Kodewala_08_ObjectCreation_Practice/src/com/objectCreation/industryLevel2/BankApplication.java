package com.objectCreation.industryLevel2;

import com.objectCreation.industryLevel.BankAccount;

public class BankApplication {

	public static void main(String[] args) {

		
	BankAccount acc1=new BankAccount(1001,"Gautam",50000);
		
		acc1.deposit(20000);
		acc1.dispalyBalance();
	}

}
