package miniProjectEcommerce;

public class FlipkartUser extends Flipkart {

	void myntraUserDisplay() {
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

	}

}
