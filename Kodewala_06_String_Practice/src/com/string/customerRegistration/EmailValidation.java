package com.string.customerRegistration;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email: ");
		String email=sc.nextLine();
		
		if(email.contains("@")&&
				email.contains(".")&&
				email.indexOf("@") < email.lastIndexOf("."))
			
		{
			System.out.println("Valid Email Address");
			
		}
		else
		{
			System.out.println("Invalid Email Address");
		}
		sc.close();
	}

}
