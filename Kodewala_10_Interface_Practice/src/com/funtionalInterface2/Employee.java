package com.funtionalInterface2;

public class Employee {

	public static void main(String[] args) {

		SalaryCalculator sc = (hours,rate) -> hours * rate;
		
		double salary = sc.calculateSalary(160, 500);
		
		System.out.println("Employee Salary: "+salary);
	}

}
