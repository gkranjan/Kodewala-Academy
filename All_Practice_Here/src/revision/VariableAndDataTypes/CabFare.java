package revision.VariableAndDataTypes;

import java.util.Scanner;

public class CabFare {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter name of cab: ");
		String cabName=sc.nextLine();
		
		System.out.print("Distance cover: ");
		double distance=sc.nextDouble();
		
		System.out.println("Rate is Rs.8/Km");
	
		double totalFare=distance*8;
		
		System.out.printf("%-10s  : %s%n","Cab Name",cabName);
		System.out.printf("%-10s  : %.2f%n","Total Fare",totalFare);
		
		sc.close();
	}

}
