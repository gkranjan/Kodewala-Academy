package com.zepto.exception;

public class Driver {

		public void createUser(String userName,String password)
		{
			System.out.println("Driver.createUser()....START");
			
			// Generate the user Id
			String userId=null;
			try {
				// Code to connect with Database
				//Open connection with Database
				
				
			// int a=100/0;
				String country ="IN";
				System.out.println("Driver.createUser().....Country is "+country);
				userId=userName.substring(0, 5)+"123"; // risky code-This code may throw exception
				System.out.println("Driver.createUser()...and generated user Id: "+userId +" END");
				
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
				System.out.println("Cann't divide by zero"); 
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
				System.out.println("User name is null");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Unknow exception....");
			}
			// mendatory executable block. here write these line to print every situation.
			finally 
			{
				System.out.println("Driver.createUser().....Closed the DB connection...");
			}
			System.out.println("END");
		}

}
