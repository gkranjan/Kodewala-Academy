package com.oops.superKeyword;

public class Child1 extends Parent1{
	
	String name="Ranjan";
	String name1="hello";
	
	void display()
	{
		System.out.println("Child:" +this.name+" " +this.name1);
		System.out.println("Parent:" +super.name);
		super.display1();
		
	}

}
