package com.practice.logGenerator;

import java.util.Scanner;

public class CustomerActivityLog {

	public static void main(String[] args) {

		//  append used in this program.
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Customer Name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter Activity: ");
		String activity = sc.nextLine();
		
		System.out.println("Enter Date: ");
		String date = sc.nextLine();
		
		System.out.println("Enter Status: ");
		String status = sc.nextLine();
		
		StringBuffer log = new StringBuffer();
		
		log.append("Customer Name: ").append(name);
		log.append("\nActivity: ").append(activity);
		log.append("\nDate: ").append(date);
		log.append("\nStatus: ").append(status);
		
		System.out.println("\n-----CUSTOMER ACTIVITY LOG------");
		System.out.println(log);
		sc.close();
	}

}
