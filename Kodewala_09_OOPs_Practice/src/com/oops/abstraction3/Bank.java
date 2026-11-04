package com.oops.abstraction3;

abstract  class Bank {
	
abstract void loanInterestRate(); // implementation,only declaration	

}

class HDFC extends Bank
{
	@Override
	void loanInterestRate()
	{
		System.out.println("HDFC Loan Interest Rate: 8.2%");
	}
}
