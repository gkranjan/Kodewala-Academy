package com.interfacePct.loginAuthentication.lambda6;

public class UserAuthentication {

	public static void main(String[] args) {

		LoginValidation login = (userName,password)->
		{
		return userName.equals("admin") && password.equals("Java123");	
		};
		
		boolean result1 = login.validate("admin","Java123");
		boolean result2 = login.validate("user", "12345");
		
		if(result1)
		{
			System.out.println("Login Successful");
		}
		else 
		{
			System.out.println("Invalid Credentials");
		}
		
		if(result2)
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}

}
