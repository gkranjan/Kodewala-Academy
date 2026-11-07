package com.zepto;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Driver.main()....START");
		/**
		 * (ArrayIndexOutOfBoundsException)
		 */
//		String name =args[0]; // values give in the command line argument.
//		System.out.println("Length of string is " +name.length());//without give values in commandline then output is (ArrayIndexOutOfBoundsException)
		
		/**
		 * ( NullPointerException )
		 */
//		String name=null; // put the null means nothing
//		System.out.println("Length of String is "+name.length()); // without giving string values then output is ( NullPointerException )
		
		/**
		 * (ArithmeticException)
		 */
//		int amount=100;
//		int result= amount/0; // give the output is (ArithmeticException) because they divide to Zero.it means cann't perform with zero.
//		System.out.println("ArithmeticException: "+result);
		
		/**
		 * Completlly run the program. without any error.
		 */
		String name="Java";
		System.out.println("Length of String is "+name.length());
		
		Driver driver=new Driver();
		driver.doSomething();
		
		System.out.println("Driver.main()....END");
	}
	private void doSomething()
	{
		System.out.println("Driver.main()....START");
		System.out.println("Driver.main()....doSomething");
		System.out.println("Driver.main()....END");

	}

}
