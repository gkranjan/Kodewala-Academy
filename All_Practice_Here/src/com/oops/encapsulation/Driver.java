package com.oops.encapsulation;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account holder name:");
		String name=sc.nextLine();
		
		System.out.println("Enter account number:");
		String accholder=sc.nextLine();
		
		System.out.println("Enter amount:");
		double balance=sc.nextDouble();
		
		System.out.println("Enter amount want to credit amount:");
		int amount=sc.nextInt();
		
		System.out.println("Enter withdraw amount:");
		int amountdbt=sc.nextInt();
		
		
		Account acc=new Account(name,accholder,balance);
		acc.getBalance();
		acc.getcredit(amount);
		acc.withdraw(amountdbt);
		acc.displayUserDetails();
		
	
		//Account obj = new Account("Gautam", "55547221358", 50000);

//		obj.getBalance();
//		obj.getcredit(500);
//		obj.withdraw(1000);
//		obj.displayUserDetails();
		
		
		sc.close();
	}

}
