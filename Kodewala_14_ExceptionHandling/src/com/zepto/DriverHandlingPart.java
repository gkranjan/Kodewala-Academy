package com.zepto;

public class DriverHandlingPart {

	public static void main(String[] args) {

		System.out.println("DriverHandlingPart.main()");
		
		try
		{
			String name=null;
			System.out.println("DriverHandlingPart.main()...length" +name.length()); // here is the error ,that'why i use the try and catch.
			//used this because the code will run smothlly and through the error msg in after the program completed then show the error msg.
			
			DriverHandlingPart handlingPart=new DriverHandlingPart();
			handlingPart.doSomething();
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception : Name is null");
			e.printStackTrace();
		}
		System.out.println("DriverHandlingPart.main()....END");
	}
	
	private void doSomething()
	{
		System.out.println("DriverHandlingPart.main().....START");
		System.out.println("DriverHandlingPart.main()....MED");
		System.out.println("DriverHandlingPart.main()....END");

	}

}
