package com.oops.parmaterized.constructor;

public class BoxDriver {

	public static void main(String[] args) {

		Box obj=new Box(10,20); // then here will not give the value.
		
		
		System.out.println("Sum:" +(obj.x+obj.y));
		
	}

}
