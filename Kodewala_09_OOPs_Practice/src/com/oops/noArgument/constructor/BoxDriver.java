package com.oops.noArgument.constructor;

public class BoxDriver {

	public static void main(String[] args) {

		Box a=new Box();
		
		
		System.out.println("X = " + a.x);
        System.out.println("Y = " + a.y);
        System.out.println("Sum = " + (a.x + a.y));
        
		System.out.println( "Sum =" +(a.x+a.y));
	}

}
