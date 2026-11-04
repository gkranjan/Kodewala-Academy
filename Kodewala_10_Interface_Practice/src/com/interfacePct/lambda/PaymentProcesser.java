package com.interfacePct.lambda;

@FunctionalInterface
interface PaymentService {
	
	boolean processPayment(double amount);
}
public class PaymentProcesser
{
	public static void main(String[] args) {
		
		// using Lambda Expression to implement the functional interface
		
		PaymentService creditCardPayment = amount -> 
		{
			System.out.println("Processing credit card card payment of $" +amount);
			return true;
		};
		
		// Calling the method
		boolean status = creditCardPayment.processPayment(250.75);
		System.out.println("Payment successful: "+status);
	
	}
	
}
