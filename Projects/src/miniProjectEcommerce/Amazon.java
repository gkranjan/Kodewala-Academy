package miniProjectEcommerce;

import java.util.Scanner;

public class Amazon {
	/**
	 * Decrlare the all argument to static it means use in the class.
	 */
	static String name;
	static String email;
	static String mobile;

	public static void amazonInterface() {
		Scanner sc = new Scanner(System.in);

		System.out.println("<======== Hello =========>");
		System.out.println("!!! Welcome To Amazon !!!");
		System.out.println();

		System.out.print("What do you want GuestUser/SignUp: ");
		String want = sc.nextLine().toLowerCase();
		System.out.println("");

		if (want.equals("guestuser")) {

			System.out.println("<====== Welcome To GuestUser ======>");
			System.out.println("");

			System.out.print("Enter your MobileNumber:");
			String mb = sc.nextLine();
			mobile = mb;
			System.out.println();

			System.out.println("<======= Successfully login To GuestUser in Amazon ======>");
			System.out.println("<========!!! Your Detail Below !!!======>");
			System.out.println();

		} else if (want.equals("signup")) {

			System.out.println("<====== Welcome To SignUp =====>");
			System.out.println();

			System.out.print("Enter Your name:");
			String nm = sc.nextLine();
			name = nm;

			System.out.print("Enter Your EmailId:");
			String em = sc.nextLine();
			email = em;

			System.out.print("Enter Your MobileNumber:");
			String mbb = sc.nextLine();
			mobile = mbb;
			System.out.println("");

			System.out.println("<======== Successfully login  to Amazon ======>");
			System.out.println("<=======!!! Your Details below !!!=======>");
			System.out.println();

		}

		else {
			System.err.println("Please Enter Correct input!!!Try again!!!");

		}
		sc.close();
		AmazonUser am = new AmazonUser();
		am.amazonUserDisplay();
	}

}
