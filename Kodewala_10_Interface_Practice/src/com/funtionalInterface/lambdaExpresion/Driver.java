package com.funtionalInterface.lambdaExpresion;

public class Driver {

	public static void main(String[] args) {
Payment payment = (amount) -> {
	
	System.out.println("Payment successful: " +amount);
	};
	
	payment.pay(2500);
	}

}
