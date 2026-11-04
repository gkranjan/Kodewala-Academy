package com.wholeInterface.bankingProcessingSystem;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. UPI Payment");
		System.out.println("2. Credit Card Payment");
		
		System.out.println("Select Payment Mode: ");
		int choice = sc.nextInt();
		
		System.out.println("Enter Amount:");
		double amount = sc.nextDouble();
		
		IPayment payment;
		IReceipt receipt;
		
		switch (choice)
		{
		case 1:
			payment = new UpiPayment();
			receipt =(IReceipt) payment;
			break;
			
		case 2:
			payment=new CardPayment();
			receipt=(IReceipt)payment;
			break;
			
			default:
				System.out.println("Invalid Choice");
				sc.close();
				return;
		}
		PaymentService service =new PaymentService();
		service.processPayment(payment, receipt, amount);
		sc.close();
		
	}

}
