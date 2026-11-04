package miniProjectEcommerce;

import java.util.Scanner;

public class Myntra {

	/**
	 * I use static because i used anywhere in the class outside the subclass.
	 */

	static String name;
	static String email;
	static String mobile;

	public static void myntraInterface() {
		Scanner sc = new Scanner(System.in); // for user input.

		/**
		 * print first all that line.
		 */

		System.out.println("<========Hello=========>");
		System.out.println("!!! WelCome To Myntra !!!");
		System.out.println();

		/**
		 * give user input,what he want to where he go.guestuser or signup.
		 */

		System.out.print("What do you want GuestUser/SignUp: ");
		String want = sc.nextLine().toLowerCase(); // lower case used for convert the Upper letter to lower case.
		System.out.println();

		/**
		 * i use switch because comparing the user input data.
		 */

		switch (want) {

		case "guestuser": {
			if (want.equals("guestuser")) {

				System.out.println("<====== Welcome To GuestUser ======>");
				System.out.println("");

				System.out.print("Enter Mobile Number: ");
				String mob = sc.nextLine();
				mobile = mob;
				System.out.println();

				System.out.println("<======= Successfully login To GuestUser in Myntra ======>");
				System.out.println("<======!!! Your Detail Below !!!======>");
				System.out.println();

			}
			break;
		}

		case "signup": {
			if (want.equals("signup")) {

				System.out.println("<====== Welcome To SignUp Window =====>");
				System.out.println();

				System.out.print("Enter Your Name:");
				String nam = sc.nextLine();
				name = nam;

				System.out.print("Enter your EmailId: ");
				String eml = sc.nextLine();
				email = eml;

				System.out.print("Enter your MobileNumber: ");
				String mob1 = sc.nextLine();
				mobile = mob1;
				System.out.println();

				System.out.println("<======== Successfully login  to Myntra ======>");
				System.out.println("<=======!!! Your Details below !!!=======>");
				System.out.println("");
			}
			break;
		}
		default:
			System.out.println("Enter valid input");

			sc.close();
		}

		/**
		 * call the myntraDisplay method . but this i called here because the compiler
		 * will execute line by line. that why i call the method with the help of that
		 * object. used in method outside the condition **
		 */

		MyntraUser user = new MyntraUser();
		user.myntraUserDisplay();
	}
}
