package com.oops.polymorphism3;

public class Registration {
	
	// Method 1: Registration using Aadhar
	void doRegistration(String adhar)
	{
		
		System.out.println("Registred using Aadhar: "+adhar);
	}
	
	// Method 2: Registration using Mobile and OTP (Different Number of Parameters)
	void doRegistration(String mobile,int otp)
	{
		System.out.println("Registration using Mobile: " +mobile+" With OTP: "+otp);
	}
	
	//Method 3: Registration using Name and Email(Different type of parameters)
	void doRegistration(String name,String email)
	{
		System.out.println("Registration using Name: " +name+" and Email: " +email);
	}
	
	//Method 4: Registration using OTP and Mobile (Different orer of parameter)
	void doRegistration(int otp,String mobile)
	{
		System.out.println("Registration using OTP: " +otp+" for Mobile: "+mobile);
	}
}
