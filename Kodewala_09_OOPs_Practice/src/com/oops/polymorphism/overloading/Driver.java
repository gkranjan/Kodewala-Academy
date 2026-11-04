package com.oops.polymorphism.overloading;

public class Driver {

	public static void main(String[] args) {

		Payment payment=new Payment();
		
		payment.processPayment(500); //Calls method with one int parameter
		payment.processPayment("kodewala@upi",1000); //Calls method with String and int
		payment.processPayment(true, 2000);  //Calls method with boolean and int
		payment.processPaymentDriver("Gautam",50000,"gkranjan@gmail.com");
		
		/**
		 * check for Demo and practice purpose.
		 */
		Demo payment1=new Demo();
		payment1.checkDemo();
	}

}

// Calling overload method based on the provided args.
