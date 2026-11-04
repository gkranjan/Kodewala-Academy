package com.oops.staticKeyword.Constructor;

public class Counter1 {
	static int count=0;
	
	Counter1()
	{
		count++;
	}
	static void show()
	{
		System.out.println("Object " +count);
	}

}
