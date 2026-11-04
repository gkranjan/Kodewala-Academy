package com.oops.polymorphism.overridden;

public class PaymentSystem {
/**
 * This is the Driver class all classes call to here.
 * @param args
 */
	public static void main(String[] args) {

		Payment payment; //This type you declare and also used the payment variable.
						 // Parent class reference pointing to different child class objects
		
		payment=new UPI(); // Processing UPI payment
		payment.processPayment(5000.45);  // Calls overriden method in UPI 
		
		payment=new CCPay();  //Processing Credit Card payment
		payment.processPayment(10000.78);  // Calls overridden method in CCPay
		
		payment=new Payment();
		payment.processPayment(6399.45);
	}

}


/**
 * RunTime Polymorphism
 */

