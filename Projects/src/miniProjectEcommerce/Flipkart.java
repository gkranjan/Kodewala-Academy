package miniProjectEcommerce;

import java.util.Scanner;

public class Flipkart {

	static String name;
	static String email;
	static String mobile;

	public static void flipkartInterface() {

		System.out.println("<========Hello=========>");
		System.out.println("!!! Welcome To Flipkart !!!");
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		System.out.print("What do you want GuestUser/SignUp: ");
		String want = sc.nextLine().toLowerCase();
		System.out.println();

		switch (want) {
		case "guestuser":
			if (want.equals("guestuser")) {

				System.out.println("<====== Welcome To GuestUser ======>");
				System.out.println("");

				System.out.print("Enter mobile number:");
				String mob = sc.nextLine();
				mobile = mob;
				System.out.println();

				System.out.println("<======== Successfully login  to GuestUser in Flipkart ======>");
				System.out.println("<=======!!! Your Details below !!!=======>");
				System.out.println();
				break;

			}
		case "signup": {

			if (want.equals("signup")) {

				System.out.println("<====== Welcome To SignUp =====>");
				System.out.println();

				System.out.print("Enter your name: ");
				String nam = sc.nextLine();
				name = nam;

				System.out.print("Enter your email-id: ");
				String eml = sc.nextLine();
				email = eml;

				System.out.print("Enter your mobile number: ");
				String mob2 = sc.nextLine();
				mobile = mob2;
				System.out.println();

				System.out.println("<======== Successfully login  to Flipkart ======>");
				System.out.println("<=======!!! Your Details below !!!=======>");
				System.out.println();
				break;

			} else {
				System.out.println("Please Enter Correct input!!! Try again !!!");
				break;
			}
		  }
		}
		sc.close();
		FlipkartUser fk = new FlipkartUser();
		fk.myntraUserDisplay();
	}
}
