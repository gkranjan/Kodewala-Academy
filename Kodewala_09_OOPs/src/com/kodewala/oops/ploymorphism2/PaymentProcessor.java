package com.kodewala.oops.ploymorphism2;

public class PaymentProcessor {
	
								// Payment payment = new CreditCardPayment();  // upcasting 
	public void processPayment(Payment payment) // can accept any type of Payment(CreditCard, DebitCard etc) object
	  {
		//  Payment payment = new NetBankingPayment();
		  payment.doPayment(); // Polymorphism  // Payment payment = new NetBankingPayment();
	  }	

}
