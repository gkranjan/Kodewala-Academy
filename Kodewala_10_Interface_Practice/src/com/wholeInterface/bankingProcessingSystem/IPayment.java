package com.wholeInterface.bankingProcessingSystem;

/**
 * This is the normal interface
 */
public interface IPayment {
	
	void pay(double amount);
	
	default void displayBankName()
	{
		System.out.println("Bank: SBI Bank");
	}
	
	static boolean validateAmount(double amount)
	{
		return amount > 0;
	}

}
