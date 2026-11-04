package com.oops.polymorphism2;

public class Driver {

	public static void main(String[] args) {

		Person person;
		
		person=new Student();
		person.showRole();// call the student class and method
		
		person=new Boyfriend();
		person.showRole(); // call the boyfriend class and method.
		
//		person=new Person();
//		person.showRole();
		
		
	}

}
