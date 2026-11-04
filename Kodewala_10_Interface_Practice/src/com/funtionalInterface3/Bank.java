package com.funtionalInterface3;

public class Bank {

	public static void main(String[] args) {

		LoanEligibility loan = salary -> salary >= 50000;
		
		LoanEligibility loan1= salary -> salary <= 80000;
		
		
		System.out.println("grater than: "+loan.checkLoan(45000));
		System.out.println("less than: "+loan1.checkLoan(78000));
		
		System.out.println("less than: "+loan1.checkLoan(85000));
		System.out.println("Grater than: "+loan.checkLoan(80000));
		
	}

}
