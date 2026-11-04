package javaBasicVariables;

import java.util.Scanner;

public class TotalAndAverage {

	public static void main(String[] args) {

		/**
		 * arrgument pass by developer.
		 */
//		int a= 85;
//		int b= 40;
//		int c= 33;
//		int d= 50;
//		int e= 77;
//		int total=a+b+c+d+e;
//		int average=total/5;
//		
//		System.out.println("Total Number: " +total);
//		System.out.println("Average Number: " +average);
		
		/**
		 * Arrugument pass by user.(User Input)
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Five number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int total=a+b+c+d+e;
		int average=total/5;
		
		System.out.println("Total Number: " +total);
		System.out.println("Average Number: " +average);
		
		
		
		
		
		
	}

}
