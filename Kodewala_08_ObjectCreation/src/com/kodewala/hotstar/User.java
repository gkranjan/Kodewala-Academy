package com.kodewala.hotstar;

public class User {
	
	String userId;
	String userName;
	String type;
	
	public static int liveUserCount=0;
	
	public User(String userId,String userName,String type)
	{
		super();
		this.userId=userId;
		this.userName=userName;
		this.type=type;
		
	}
	
	public User(String userName,String type)
	{
		super();
		
		this.userName=userName;
		this.type=type;
	}
	
	public User()
	{
		
	}
	{
		liveUserCount=liveUserCount+1;
	}
}
