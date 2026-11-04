package com.practice.builder.passwordMasking;

import java.util.Scanner;

public class AccountMasking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Number: ");
		String account = sc.nextLine();

		StringBuilder masked = new StringBuilder(account);

		for (int i = 0; i < masked.length() - 4; i++) {

			masked.setCharAt(i, 'X');

		}

		System.out.println("\nOriginal Account: " + account);
		System.out.println("Masked Account: " + masked);
		sc.close();
	}

}
