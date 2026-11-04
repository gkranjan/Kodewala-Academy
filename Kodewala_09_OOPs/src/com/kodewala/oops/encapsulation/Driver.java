package com.kodewala.oops.encapsulation;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
			
		Payment payment=new Payment(1500);
		
		// directly modifying the data of payment 
		payment.doCredit(5000);
		
		payment.doDebit(5000);
		
		//System.out.println("Credit:"+payment.getBalance());
		//System.out.println("Debit:" +payment.getBalance());
		
		
		
//		System.out.println("Enter amount:");
//		int amt=sc.nextInt();
//		
//		System.out.println("Total amount:" +payment.getBalance());
		
		sc.close();
	}

}
