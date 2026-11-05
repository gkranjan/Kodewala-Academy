package com.bank.service;

import com.bank.model.BankAccount;

public class AccountService {

	public static void main(String[] args) {

		BankAccount account1=new BankAccount(133455466L,"Amit",75000);
		
		try
		{
			BankAccount backupAccount = (BankAccount) account1.clone();
		
		
			System.out.println("Original Account:");
			account1.display();
			
			System.out.println("\nBackup Account: ");
			backupAccount.display();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
