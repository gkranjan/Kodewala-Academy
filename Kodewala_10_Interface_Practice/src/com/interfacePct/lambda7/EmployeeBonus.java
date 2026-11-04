package com.interfacePct.lambda7;

import java.util.function.Function;

public class EmployeeBonus {

	public static void main(String[] args) {

		Function<Double,Double> bonusCalaculator =salary ->
		{
			return salary *0.10;
			
		};
		
		double salary =50000;
		
		double bonus = bonusCalaculator.apply(salary);
		
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee Bonus: " +bonus);
		System.out.println("Total Salary: "+(salary+bonus));
	}

}
