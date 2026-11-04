package javaFundamentals_1_20;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number:");
		double c=sc.nextDouble();
		
		double f = c*9/5+32;
		System.out.println("F = "+f);
		sc.close();
	}

}
