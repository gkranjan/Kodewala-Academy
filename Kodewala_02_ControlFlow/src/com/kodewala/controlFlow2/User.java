package com.kodewala.controlFlow2;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want Gold / Silver / Regular :");
		String type = sc.nextLine().toLowerCase();

		System.out.println("Enter amount: ");
		int amount = sc.nextInt();

		User obj = new User();
		obj.customerType(type, amount);

		sc.close();

	}

	public void customerType(String discount, int amount) {
		switch (discount) {
		case "Gold":
			if (amount >= 1000) {
				System.out.println("Discount applied 20% ");
			} else if (amount <= 1000) {
				System.err.println("In Gold no discount applied because you have less amount!!!");
			}

			break;

		case "Silver":
			if (amount >= 1000) {
				System.out.println("Discount applied 10% ");
			} else if (amount <= 1000) {
				System.err.println("In Silver no discount applied because you have less amount!!!");
			}
			break;

		case "Regular":
			if (amount >= 1000) {
				System.out.println("Discount applied 5% ");
			} else if (amount <= 1000) {
				System.err.println("In Regular no discount applied because you have less amount!!!");
			}
			break;

		default:
			System.err.println("Please enter correct input:");
		}

	}
}
