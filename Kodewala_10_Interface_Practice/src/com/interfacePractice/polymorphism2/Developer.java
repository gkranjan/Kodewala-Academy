package com.interfacePractice.polymorphism2;

public class Developer extends Employee {

	Developer(String name)
	{
		super(name);
	}
	
	@Override
	double calculateSalary()
	{
		return 50000;
	}
	
}
