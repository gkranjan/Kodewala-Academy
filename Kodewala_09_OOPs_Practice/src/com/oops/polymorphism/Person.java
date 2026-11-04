package com.oops.polymorphism;

class Person {

	void showRole()
	{
		System.out.println("I am a person with multiple roles.");
	}
}

class Student extends Person
{
	@Override
	void showRole()
	{
		System.out.println("I am the student .I study attend class.");
	}
}

class Boyfriend extends Person
{
	@Override
	void showRole()
	{
		System.out.println("I am a Boyfriend.I spend time with my partner.");
	}
}

//public class PolymorphismExample
//{
//	public static void main(String[] args) {
//		
//		Person person;
//		person=new Student();
//		person.showRole();
//		
//		person=new Boyfriend();
//		person.showRole();
//		
//		
//		
//		
//	}
//
//}
