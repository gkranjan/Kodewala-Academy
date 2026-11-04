package com.wholeInterface.bankingProcessingSystem;

public class UpiPayment implements IPayment,IReceipt,ISecureTransaction{

	@Override
	public void generateReceipt(double amount) {
		
		System.out.println("UPI Receipt Generated: "+amount);
	}

	@Override
	public void pay(double amount) {
		
		System.out.println("Payment mode: UPI");
		System.out.println("UPI Payment Successful");
		System.out.println("Paid Amount: "+amount);
		
	}
	
	

}
