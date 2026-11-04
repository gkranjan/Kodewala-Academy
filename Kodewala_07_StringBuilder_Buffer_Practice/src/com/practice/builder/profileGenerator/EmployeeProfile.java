package com.practice.builder.profileGenerator;

import java.util.Scanner;

public class EmployeeProfile {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Department: ");
		String department = sc.nextLine();
		
		System.out.println("Enter Salary: ");
		double salary =sc.nextDouble();
		
		StringBuilder profile = new StringBuilder();
		
		profile.append("\n======== EMPLOYEE PROFILE =======\n");
		profile.append("Employee ID: ").append(id).append("\n");
		profile.append("Name: ").append(name).append("\n");
		profile.append("Department: ").append(department).append("\n");
		profile.append("Salary: Rs.").append(salary);
		
		System.out.println(profile);
		sc.close();
	}

}
