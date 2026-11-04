package com.interface1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PaymentService service = new PaymentService();
		// This type also call.
		// service.processPayment(new CashOnDelivery(), 500);

		// this type also declare and call the method.
		IPayment payment = null;

		System.out.println("===== PAYMENT GATEWAY =====");
		System.out.println("1. UPI Payment");
		System.out.println("2. Credit Card");
		System.out.println("3. Cash on Delivery");
		System.out.print("Choose payment mode: ");

		int choice = sc.nextInt();

		System.out.print("Enter amount: Rs. ");
		double amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("Invalid amount!");
		} else {
			switch (choice) {
			case 1:
				payment = new UPIPayment();
				break;

			case 2:
				payment = new CardPayment();
				break;

			case 3:
				payment = new CashOnDelivery();
				break;

			default:
				System.out.println("Invalid payment option!");
			}

			if (payment != null) {
				service.processPayment(payment, amount);
			}

		}
		sc.close();

	}

}
