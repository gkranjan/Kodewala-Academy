package com.oops.polymorphism.attachived;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter branch name: ");
		String input = sc.nextLine();
		
		Driver driver=new Driver();
		
		driver.userInput(input);
		sc.close();
	}

}
