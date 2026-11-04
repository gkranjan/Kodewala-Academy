package com.interfacePct.lambda10;

import java.util.function.Consumer;


public class PaymentProcessing {

	public static void main(String[] args) {

		Consumer <String> paymentStatus = status -> {
			System.out.println("Payment Status: " + status);
			System.out.println("Transaction Completed Successfully.");

		};
		paymentStatus.accept("SUCCESS");
	}

}
