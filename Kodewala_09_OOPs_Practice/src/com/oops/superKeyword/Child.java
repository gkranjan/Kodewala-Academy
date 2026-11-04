package com.oops.superKeyword;

public class Child extends Parent {

	int value=20;
	
	void display()
	{
		System.out.println("Child:" +this.value);
		System.out.println("Parent: " +super.value);
		super.show();
	}
}
