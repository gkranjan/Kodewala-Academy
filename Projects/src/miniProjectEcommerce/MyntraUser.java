package miniProjectEcommerce;

import miniProjectEcommerce2Part.MyntraCategories;

public class MyntraUser extends Myntra {

	/**
	 * myntraDisplay method will print the both details that is guestuser and
	 * signup.
	 */

	public void myntraUserDisplay() {

		/**
		 * condition for user input display.what should be display.
		 */

		if (name == null && email == null) {

			System.out.println("GuestUser mobile number is:" + mobile);
			System.out.println();

		} else {
			System.out.println("Your Name is " + name);
			System.out.println("Your EmailId is " + email);
			System.out.println("Your MobileNumber is: " + mobile);
			System.out.println();
		}

		System.out.println("<========THANK YOU=========>");
		System.out.println();

		MyntraCategories ct = new MyntraCategories();
		ct.purchase();
	}

}
