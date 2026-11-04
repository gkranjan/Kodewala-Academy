package com.practice.OTPGenerator;

import java.util.Scanner;

public class OTPGenerator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Customer Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter OTP: ");
		String otp = sc.nextLine();
		
		StringBuffer message = new StringBuffer();
		
		message.append("Hello ").append(name);
		message.append(", your OTP is ").append(otp);
		message.append(". Valid for 5 minutes.");
		
		System.out.print("\nOriginal Message: ");
		System.out.print(message);
		
		message.append(" Do not share it with anyone.");
		
		System.out.print("\nUpdated Message: ");
		System.out.print(message);
		sc.close();
	}

}
