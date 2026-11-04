package miniProjectEcommerce;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // User input for redirect them.

		/**
		 * In this switch statement are only call the 3 class amazon/flipkart/myntra.
		 * and also print and input the user values only in particular class.
		 * 
		 */
		System.out.print("Enter Your Choice Amazon/Flipkart/Myntra: ");
		String choose = sc.nextLine().toLowerCase();
		System.out.println();
		switch (choose) 
		{
		case "amazon":
			Amazon.amazonInterface();
			break;

		case "flipkart":
			Flipkart.flipkartInterface();
			break;

		case "myntra":
			Myntra.myntraInterface();
			break;
		default:
			System.err.println("!!! Enter only of Three !!!!");
		}
		
		
		
		
		
		
		
		
		
		
				sc.close();	
	}
}
