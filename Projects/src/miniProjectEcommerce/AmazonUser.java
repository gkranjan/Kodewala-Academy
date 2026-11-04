package miniProjectEcommerce;

public class AmazonUser extends Amazon {
	
	void amazonUserDisplay()
	{
		
		if (name == null && email == null) {

			System.out.println("GuestUser mobile number is:" + mobile);
			System.out.println();

		} else {
			System.out.println("Your Name is " + name);
			System.out.println("Your EmailId is " + email);
			System.out.println("Your MobileNumber is: " + mobile);
			System.out.println();
			
			
//			System.out.println("\n╔══════════════════════════════════════╗");
//	        System.out.println("║             USER DETAILS             ║");
//	        System.out.println("╠══════════════════════════════════════╣");
//	        System.out.printf("║ Name         : %-23s ║%n", name);
//	        System.out.printf("║ Email ID     : %-23s ║%n", email);
//	        System.out.printf("║ Mobile Number: %-23s ║%n", mobile);
//	        System.out.println("╚══════════════════════════════════════╝");
//			
				
		}

		System.out.println("<========THANK YOU=========>");
	}
	}


