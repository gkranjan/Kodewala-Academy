package javaFundamentals_1_20;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter number:");
		double f=sc.nextDouble();
		double c=(f-32) * 5/9;
		System.out.println("C = " +c);
		sc.close();
	}

}
