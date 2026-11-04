package com.interfacePct.function.lambda7;

import java.util.function.Function;

public class AnnualSalary {

	public static void main(String[] args) {
		// Double, Double :Function<T,R> // T:- Input Data Type , R:- Return Data Type
		Function<Double,Double> salaryCalculator = monthlySalary -> monthlySalary *12;
		
		// apply() is the abstract of function interface method.
		// iesko ham input de rahe hai.
		double annualSalary = salaryCalculator.apply(120000.0);
		System.out.println("Annual Salry: "+annualSalary);
	}

}
