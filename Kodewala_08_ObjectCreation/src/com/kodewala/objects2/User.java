package com.kodewala.objects2;

public class User {
	
	
	public String name;
	String userId;
	String mobileNumber;
	
	static
	{
		// static block will get executed just after the class loading.
		System.out.println("i m in static block 1");
	}
	static
	{
		// static block will get executed just after the class loading.
		System.out.println("i m in static block 2");
	}
	
	static
	{
		// static block will get executed just after the class loading.
		System.out.println("i m in static block 3");
	}

	public User(String name, String userId, String mobileNumber) {
		super(); // either super or this
		
		System.out.println("User.user(String name, String userId, String mobileNumber)...constructor");
		this.name = name;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
		
		display();
	}
	
	public void display()
	{
		
		System.out.println(name+", " +userId+"," +mobileNumber);
	}
	
	

}
