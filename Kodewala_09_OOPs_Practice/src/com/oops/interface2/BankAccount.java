package com.oops.interface2;

public interface BankAccount {
	
	public static final double MIN_BALANCE = 1000.00; //Constant
	
		// Abstract Method
		
		public abstract void deposit(double amount);
		public abstract void withdraw(double amount);
		public abstract double checkBalance();
	

}
