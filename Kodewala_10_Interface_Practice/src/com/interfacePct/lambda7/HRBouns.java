package com.interfacePct.lambda7;

import java.util.function.Function;

public class HRBouns {

	public static void main(String[] args) {

		Function<Double,Double> bonusCalculator=salary->
		{
			return salary * 0.20;
		};
		
		double salary = 10000;
		
		double bonus= bonusCalculator.apply(salary);
		
		System.out.println("HR Salary: "+salary);
		System.out.println("HR Bonus: " +bonus);
		System.out.println("Total Salary: "+(salary + bonus));
	}

}
