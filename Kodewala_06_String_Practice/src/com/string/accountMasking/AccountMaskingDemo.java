package com.string.accountMasking;

import java.util.Scanner;

public class AccountMaskingDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Number:");
		String number = sc.nextLine();

		// .matches is check the number and given format.
		if (number.matches("\\d{4,}")) {
			String lastFour = number.substring(number.length() - 4);

			String masked = number.substring(0, number.length() - 4).replaceAll(".", "X") + lastFour;

			System.out.println("Masked Account Number: " + masked);

		} else {
			System.out.println("Invalid Account Number:");
		}
		sc.close();
	}

}
