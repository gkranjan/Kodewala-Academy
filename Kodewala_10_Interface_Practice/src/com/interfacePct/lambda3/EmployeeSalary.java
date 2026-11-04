package com.interfacePct.lambda3;

public class EmployeeSalary {

	public static void main(String[] args) {

		SalaryCalculator developer =(salary) ->
		{
			return salary + (salary *0.20);
		};
		SalaryCalculator manager=(salary)->
		{
			return salary +(salary *0.30);
		};
		
		double devSalary = developer.calculateSalary(40000);
		double managerSalary = manager.calculateSalary(60000);
		
		System.out.println("Developer salary: "+devSalary);
		System.out.println("Manager Salary: " +managerSalary);
	}

}
