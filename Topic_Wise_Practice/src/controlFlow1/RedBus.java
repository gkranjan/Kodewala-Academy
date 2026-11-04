package controlFlow1;

//import java.util.Scanner;

public class RedBus {

	/**
	 * commanted line will indicate of also i will call this type for user input.
	 * in same class.
	 * this is the source code of user gives the input.
	 */
	 
	// public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter Name: ");
//		String name = sc.nextLine();
//
//		System.out.print("Enter Budget: ");
//		int budget = sc.nextInt();

	public int ticketAmount(String name, int budget) {

		if (budget > 0 && budget < 5000) {
			int amount = budget;
			System.out.println("No Discount applied: ");
			System.out.println("Final sattelment amount is : " + amount);
			System.out.println("Travelar Name:" + name);
			System.out.println("Whole Budget is: " + budget);
		}

		else if (budget >= 5000 && budget <= 10000) {
			int amount = budget * 10 / 100;
			int finalAmount = budget - amount;
			System.out.println("10% Discount Applied: ");
			System.out.println("Discounted amount: " + amount);
			System.out.println("After Discounted sattelment amount: " + finalAmount);
			System.out.println("Travelar Name:" + name);
			System.out.println("Whole Budget is: " + budget);
		} else {
			int maxDiscount = budget - 1250;
			System.out.println("Max Discount Applied of 1250 only : ");
			System.out.println("After Discounted sattelment amount: " + maxDiscount);
			System.out.println("Travelar Name:" + name);
			System.out.println("Whole Budget is: " + budget);
		}
		return budget;
	}

}
