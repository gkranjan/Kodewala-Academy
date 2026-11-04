package com.interfacePct.lambda8;

import java.util.Scanner;
import java.util.function.Predicate;

public class LoanEligibility {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter amount:");
		double amount=sc.nextDouble();
		
		Predicate<Double> loanCheck = salary -> salary >= 30000;
			 //double customerSalary = 25000;
			 
			 if(loanCheck.test(amount))
			 {
				 System.out.println("Customer is eligible for loan.");
			 }
			 else
			 {
				 System.out.println("Customer is not eligible for loan.");
			 }
		
			sc.close();
	}

}
