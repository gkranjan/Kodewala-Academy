package com.oops.noArgument.constructor;

public class BoxParmeterizedConstructorDriver {

	public static void main(String[] args) {

		BoxParmeterizedConstructor obj=new BoxParmeterizedConstructor();
		
		System.out.println("X:" + obj.x);
		System.out.println("Y:" +obj.y);
		System.out.println("Sum:" +(obj.x+obj.y));
	}

}
