package revision.VariableAndDataTypes;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Consumed Unit:");
		double unit=sc.nextDouble();
		
		
		System.out.println("per unit price:");
		double price=sc.nextDouble();
		
		double amount=unit*price;
		
		System.out.printf("Your total bill: %.2f%n",amount);
		sc.close();
	}

}
