package com.oops.questionPractice;

public class BookClass {

	String name;
	int age;
	
	void display()
	{
		System.out.println("Name:" +name+ " -> Age:" +age);
	}
	
	
	public static void main(String[] args) {

		
		BookClass obj=new BookClass();
		obj.name="Gautam";
		obj.age=28;
		obj.display();
		
		
	}

}
