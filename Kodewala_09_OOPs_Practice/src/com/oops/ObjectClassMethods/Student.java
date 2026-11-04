package com.oops.ObjectClassMethods;

public class Student {
	
	String name;
	
	Student(String name)
	{
		this.name=name;
		
	}
	@Override
	public String toString() // toString , i create this type of methods
	{
		return "Student:" +name;
	}

}
