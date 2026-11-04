package com.wholeInterface.bankingProcessingSystem;

public class CardPayment implements IPayment, IReceipt {

	@Override
	public void generateReceipt(double amount) {
		System.out.println("Card Receipt Generated: " + amount);

	}

	@Override
	public void pay(double amount) {
		System.out.println("Payment Mode: Credit Card");
		System.out.println("Card Payment Successful");
		System.out.println("Paid Amount: " + amount);
	}

}
