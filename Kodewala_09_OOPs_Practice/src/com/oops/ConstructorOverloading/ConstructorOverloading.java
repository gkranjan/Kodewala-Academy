package com.oops.ConstructorOverloading;

public class ConstructorOverloading {

	
	int x;
	int y;
	
	ConstructorOverloading()
	{
		this(10,20);
	}

	public ConstructorOverloading(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
}
