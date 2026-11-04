package com.oops.nestedAndInnerClasses;

public class Outer {
	
	int value=10;
	
	class Inner{
		
		void show()
		{
			System.out.println("Outer value= " +value);
		}
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.show();
	}

}
