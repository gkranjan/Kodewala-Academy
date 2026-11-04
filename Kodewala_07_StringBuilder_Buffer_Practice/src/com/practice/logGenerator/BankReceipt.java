package com.practice.logGenerator;

import java.util.Scanner;

public class BankReceipt {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		String account = sc.nextLine();
		
		System.out.println("Enter Transaction Type: ");
		String type = sc.nextLine();
		
		System.out.println("Enter Amount: ");
		double amount =sc.nextDouble();
		
		System.out.println("Enter Remaining Balance: ");
		double balance = sc.nextDouble();
		
		StringBuffer receipt =new StringBuffer();
		
		receipt.append("\n===== BANK RECEIPT =====");
		receipt.append("\nAccount Number: ").append(account);
		receipt.append("\nTransaction: ").append(type);
		receipt.append("\nAmount: Rs.").append(amount);
		receipt.append("\nBalance: Rs.").append(balance);
		receipt.append("\nTransaction Status: SUCCESS");
		
		System.out.println(receipt);
		sc.close();

		}

}
