package practiceProject;

//import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		/**
		 * 1) Sum class call.
		 */
		Sum obj = new Sum();
		obj.display();

		/**
		 * 2) Substract class call.
		 */
		Substract obj2 = new Substract();
		obj2.output();

		/**
		 * 3) Switch class call
		 */
//		Scanner sc = new Scanner(System.in);
//		System.err.println("<==========================>");
//		
//		System.err.println("Enter the 3rd Class call !!!!");
//		//System.out.println();
//		
//		System.out.print("What do you want Gold / Silver / Regular :");
//		String type = sc.nextLine();
//
//		System.out.print("Enter amount: ");
//		int amount = sc.nextInt();
//
//		Switch obj3 = new Switch();
//		obj3.customerType(type, amount);
//		
//		System.err.println("<==========================>");
//	
//		sc.close();

		/**
		 * 4)
		 */

		// User obj4 = new User("Gautam Yadav","gkranjan2024@gmail.com","7014327652");
		// System.out.println("Print Details:=" + obj4.name +", " +obj4.email+", "+
		// obj4.mobile);

		UserInput obj4 = new UserInput("Amar", "amarbadiger@gmail.com", "990021890");

		UserDetails obj5 = new UserDetails("I phone ", "gautamranjan@gmail.com");

		obj4.printDetails();

	}

}
