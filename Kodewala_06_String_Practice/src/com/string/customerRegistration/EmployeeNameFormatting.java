package com.string.customerRegistration;

import java.util.Scanner;

public class EmployeeNameFormatting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		name = name.trim();
		name = name.replaceAll("\\s+", "");
		name = name.toUpperCase();
		
		System.out.println("Formatted Name: " +name);
		sc.close();
	}

}
