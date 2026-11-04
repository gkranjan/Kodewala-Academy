package revision.VariableAndDataTypes;

import java.util.Scanner;

public class PayrollStarter {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Employee name:");
		String name = sc.nextLine();
		
		System.out.println("Basic salary: ");
		double basic=sc.nextDouble();
		
		System.out.println("HRA: ");
		double hra = sc.nextDouble();
		
		System.out.println("Travel allowance: ");
		double travel =sc.nextDouble();
		
		double gross = basic + hra + travel;
		System.out.println("Employee: " +name);
		System.out.printf("Gross salary: %.2f%n",gross);
		sc.close();
	}

}
