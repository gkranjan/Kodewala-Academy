package com.funtionalInterface;

public class Addition implements Calculator {

	@Override
	public void calculator() {

		int a=10;
		int b=20;
		
		System.out.println("Addition: " +(a + b));
	}

	
}
