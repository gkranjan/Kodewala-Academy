package com.interfacePct.Predicate.lambda7;

import java.util.function.Predicate;

public class EmployeeEligibility {

	public static void main(String[] args) {

		Predicate<Double> eligibility = salary -> salary>= 30000;
		
	
		System.out.println("Employee 1: "+eligibility.test(45000.0));
		
		System.out.println("Employee 2: " +eligibility.test(25000.0));
		
	}

}
