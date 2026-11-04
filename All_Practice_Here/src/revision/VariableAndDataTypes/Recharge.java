package revision.VariableAndDataTypes;

import java.util.Scanner;

public class Recharge {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		String number=sc.nextLine();
		
		System.out.println("Plan Price:");
		int plan=sc.nextInt();
		
		System.out.println("\n==================================");
        System.out.println("          RECHARGE BILL");
        System.out.println("==================================");
        
		System.out.println("18% GST included in plan");
		
		double tax= plan * 0.18;
		
		tax += plan;
		
		System.out.println("Your Number is: "+number);
		System.out.printf("Your total plan price: %.2f%n",tax);
		
		System.out.println("==================================");
        System.out.println("     RECHARGE SUCCESSFUL!");
        System.out.println("==================================");
		
        sc.close();
	}

}
