package com.revision.mixTopics;

public class Program11 {
	
	static  class BankAccount
	{
		private double balance;

		public BankAccount(double balance) {
			super();
			this.balance = balance;
		}
		
		void deposit(double amount)
		{
			if(amount > 0)
			{
				balance += amount;
			}
		}
		double getBalance()
		{
			return balance;
		}
	}
	
	public static void main(String[] args) {
		BankAccount [] accounts= {
				new BankAccount(1000),
				new BankAccount(500)
		};
		
		accounts[0].deposit(250);
		accounts[1].deposit(-20);
		
		for(BankAccount account : accounts)
		{
			System.out.println("Banlance: "+account.getBalance());
		}
	}
	

}
