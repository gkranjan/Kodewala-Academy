package com.oops.abstraction2;

 class SavingAccount extends Account{
	
	double interestRate=5.0;  //5% interest rate
	
	
	SavingAccount(double balance)
	{
		super(balance);
	}
	@Override
	void calculateInterest()
	{
		double interest = (balance * interestRate) /100;
		balance += interest;
		System.out.println("Interest added: " +interest);
	}

}
