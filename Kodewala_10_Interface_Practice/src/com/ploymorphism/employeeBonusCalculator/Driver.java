package com.ploymorphism.employeeBonusCalculator;

public class Driver {

	public static void main(String[] args) {

		double salary = 40000;
		int rating =4;
		
		Employee employee = new Developer();
		System.out.println("Developer Bonus: Rs. " + employee.calculateBonus(salary, rating));
	
		employee = new Manager();
		System.out.println("Manager Bonus: Rs. " + employee.calculateBonus(salary, rating));

		employee = new Tester();
		System.out.println("Tester Bonus: Rs. " + employee.calculateBonus(salary, rating));

		
		rating =2;
		employee=new Developer();
		System.out.println("Low Rating Bonus: Rs. " + employee.calculateBonus(salary, rating));

	}

}
