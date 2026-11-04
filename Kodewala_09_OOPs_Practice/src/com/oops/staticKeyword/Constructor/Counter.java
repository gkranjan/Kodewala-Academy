package com.oops.staticKeyword.Constructor;

public class Counter {
	static int count=0;
	
	Counter()
	{
		count++;
	}
	
	static void showCount()
	{
		System.out.println("Object=" +count);
	}

}
