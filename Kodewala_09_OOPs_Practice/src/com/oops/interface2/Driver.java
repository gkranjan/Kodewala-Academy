package com.oops.interface2;

public class Driver {

	public static void main(String[] args) {

		SavingAccount account=new SavingAccount(5040.8);
		account.deposit(89.36);
		account.withdraw(100.78);
		account.checkBalance();
		
		
		CurrentAccount ca=new CurrentAccount(578.35);
		ca.deposit(500.4);
		ca.withdraw(996.78);
		ca.checkBalance();
	}

}
