package com.interfacePractice.polymorphism2;

public class Manager extends Employee {
	
	Manager(String name){
		super(name);
	}
	
	@Override
	double calculateSalary()
	{
		return 81000;
	}

}
