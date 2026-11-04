package com.wholeInterface.bankingProcessingSystem;

public class PaymentService {
	
	public void processPayment(IPayment payment,IReceipt reciept,double amount)
		{
		if(!IPayment.validateAmount(amount))
		{
			System.out.println("Invalid Amount");
			return;
			
		}
		
		payment.displayBankName();
		payment.pay(amount);
		reciept.generateReceipt(amount);
		
		ITransactionLogger logger = message -> 
		System.out.println("LOG: "+message);
		
		logger.log("Transaction Completed");
		}

}
