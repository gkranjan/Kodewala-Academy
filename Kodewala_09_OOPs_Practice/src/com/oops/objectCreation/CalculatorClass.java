package com.oops.objectCreation;

public class CalculatorClass {

	String name;
	int age;
	
	void display()
	{
		System.out.println("Name:" + name+ " Age:"  +age);
	}
	
	
	public static void main(String[] args) {

		CalculatorClass obj=new CalculatorClass();
		obj.name="Gautam";
		obj.age=29;
		obj.display();
		
	}

}
