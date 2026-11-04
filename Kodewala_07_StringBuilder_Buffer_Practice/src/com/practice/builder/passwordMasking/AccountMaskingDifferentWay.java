package com.practice.builder.passwordMasking;

import java.util.Scanner;

public class AccountMaskingDifferentWay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Number:");
		String account = sc.nextLine();

		StringBuilder masked = new StringBuilder(account);

		if (account.matches("\\d{4,}")) 
		{
			for (int i = 0; i < masked.length()-4; i++) {
				
				masked.setCharAt(i, 'X');
			}
			System.out.println("Before AccountNumber: " + account);
			System.out.println("After Masked AccountNumber: " + masked);

		} else {
			System.out.println("Invalid Account Number......!");
		}
		sc.close();
	}

}
