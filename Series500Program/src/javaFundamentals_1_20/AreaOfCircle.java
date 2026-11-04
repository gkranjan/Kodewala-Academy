package javaFundamentals_1_20;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		double r=sc.nextDouble();
		System.out.println("Area = " +Math.PI*r*r);
		sc.close();
	}

}
