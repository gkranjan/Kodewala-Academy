package com.oops.overriding;

public class Dog extends Animal{
	
	@Override
	void sound()
	{
		
		System.out.println("Dog");
		super.sound();
	}

}
