package com.interfacePractice.polymorphism2;

public class Driver {

	public static void main(String[] args) {

		Employee e1 = new Developer("Rahul");
		Employee e2 = new Manager("Amit");
		
		System.out.println(e1.name+ ": Rs. " +e1.calculateSalary());
		
		System.out.println(e2.name+": Rs. " +e2.calculateSalary());
	}

}
