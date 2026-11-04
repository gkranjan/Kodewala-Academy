package com.oops.polymorphism3;

import java.util.Scanner;

public class MethodOverloadingDriver {

	public static void main(String[] args) {

		Registration reg = new Registration(); // Create object to method call.
		/**
		 * Method declaration time pass the args.
		 */
//		reg.doRegistration("4534847893"); // Method 1
//		reg.doRegistration("7014327652",12345);  // Method 2
//		reg.doRegistration("Gautam", "gkranjan24@gmail.com");  //Method 3
//		reg.doRegistration(45678, "9153756282");   // Method 4

		/**
		 * User input used and pass with logic
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Login the page only 4 options enter it: Adhar,Email,OTP and Number:");
		String want = sc.nextLine(); // user input

		if (want.equalsIgnoreCase("Aadhar")) {
			System.out.println("Enter your adhar number:");
			String adhar = sc.nextLine();
			reg.doRegistration(adhar); // Call Method 1
		} else if (want.equalsIgnoreCase("Number")) {
			System.out.println("Enter your Mobile Number:");
			String number = sc.nextLine();
			System.out.println("OTP sended,Enter OTP:");
			int otp = sc.nextInt();
			reg.doRegistration(number, otp); // Call Method 2
		} else if (want.equalsIgnoreCase("Name")) {
			System.out.println("Enter your Name:");
			String name = sc.nextLine();
			System.out.println("Enter Email:");
			int email = sc.nextInt();
			reg.doRegistration(name, email); // Call Method 3
		}

		else if (want.equalsIgnoreCase("OTP")) {
			System.out.println("Enter your Mobile Number:");
			String number = sc.nextLine();
			System.out.println("OTP sended,Enter OTP:");
			int otp = sc.nextInt();
			reg.doRegistration(otp, number); // Call Method 4
		} else {
			System.err.println("Try again!!"); // Error msg show
		}
		sc.close();
	}
}
