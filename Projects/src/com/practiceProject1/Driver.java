package com.practiceProject1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Requirement
//		amazon and flipkart

		System.out.println("the Enter Word : \n  Amazon \n Flipkart ");
		String str = sc.nextLine().toLowerCase();
//		String mainch =str.toLowerCase();

		switch (str) {
		case "amazon": {
			System.out.println("Enter Your Name ");
			String name = sc.nextLine();

			System.out.println("Enter Your Email ");
			String email = sc.nextLine();

			System.out.println("Enter your Phone ");
			String phone = sc.nextLine();

			Amazon a = new Amazon();
			a.userInput(name, email, phone);
			a.printDetails();

			break;
		}
		case "flipkart": {
			System.out.println("Enter Your Name ");
			String name = sc.nextLine();

			System.out.println("Enter your Phone ");
			String phone = sc.nextLine();

			Flipkart f = new Flipkart();
			f.signup(name, phone);
			f.signOut();
			f.login();
			f.logout();

			break;
		}
		}

	}
}
