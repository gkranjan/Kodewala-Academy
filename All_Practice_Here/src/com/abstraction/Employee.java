package com.abstraction;

abstract class Employee {

	String name;

	Employee(String name) {
		this.name = name;
	}

	abstract void work();

	void displayName() {
		System.out.println("Employee Name: " + name);
	}

}

class Developer extends Employee {
	Developer(String name) {
		super(name);
	}

	void work() {
		System.out.println("Developing software");
	}
}
