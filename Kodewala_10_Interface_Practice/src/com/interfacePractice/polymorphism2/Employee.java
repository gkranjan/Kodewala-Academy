package com.interfacePractice.polymorphism2;

abstract class Employee {
	String name;

	 Employee(String name) {
		super();
		this.name = name;
	}
	
	 abstract double calculateSalary();
}
