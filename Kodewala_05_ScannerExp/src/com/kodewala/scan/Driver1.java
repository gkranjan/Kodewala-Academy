package com.kodewala.scan;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int price=0;
		
		System.out.println("Please enter the price...");
		
		// before reading the integer , you are going to make sure that user
		// supply an int.
		
		if (sc.hasNextInt())
		{
			price =sc.nextInt();
		}
		
		else
		{
			System.out.println("Please enter the right foramt:");
			
			
		}
		System.out.println("price: " +price);
		sc.close();
	}
	
}
