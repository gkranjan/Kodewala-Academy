package com.kodewala.loop3;

import java.util.Scanner;

public class Driver {

// between 0 to 100

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int luckyNumber = 13;
		int userEntered = 0;

		while (luckyNumber != userEntered)// compare to not equal to both variable.
		{
			System.out.println("Please enter the number..");
			userEntered = sc.nextInt(); // userEntered used here because user input stored in that variable.

			if (userEntered == luckyNumber)// compare both of the variable.
			{
				System.out.println("You won !!!!");
			} else {
				System.err.println("please try again.....");
			}
		
			sc.close();
		}
		//sc.close();

	}

}
