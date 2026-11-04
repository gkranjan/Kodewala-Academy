package com.kodewala.oops.methodOverloading;

public class Login {
	
	public void doLogin(String mobile, int otp ) //V1
	{
		System.out.println("Login.doLogin()...mobile and otp");
	}
	
	public String doLogin(String email,String mobile) //V2
	{
		System.out.println("Login.doLogin()...email and mobile");
		
		return "Do smoething";
		
	}
	
	public void doLogin(String gmail) //V3
	{
		System.out.println("Login.doLogin()....gmail only");
	}

	
}
