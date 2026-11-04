package com.kodewala.marker.inf4;

public class User implements Cleanable
{

	String userName;
	String id;
	
	public User(String userName, String id) {
		super();
		this.userName = userName;
		this.id = id;
	}
	
	public void display()
	{
		System.out.println("User Name: "+userName);
		System.out.println("User Id: "+id);
	}
	
}
