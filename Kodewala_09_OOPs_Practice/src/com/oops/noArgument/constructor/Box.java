package com.oops.noArgument.constructor;

public class Box {
	
	int x,y;
	
	Box()
	{
		this(10,20);
	}

	public Box(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

 
