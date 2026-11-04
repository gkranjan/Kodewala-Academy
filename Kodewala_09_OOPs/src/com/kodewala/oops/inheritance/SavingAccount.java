package com.kodewala.oops.inheritance;

// existing class the in system
public class SavingAccount extends Account{
		
		public void openSavingAccount(String name,String address,String type) 
		{
	
		
			// reusing the existing functionalties.
			openBankAccount(name,address,type);
		}
	}


