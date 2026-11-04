package com.kodewala.marker.inf4;

public class DataCleaner extends User {
	
	public DataCleaner(String userName, String id) {
		super(userName, id);
		
		
	}

	public void clean(Object obj)
	{
		if(obj instanceof Cleanable)
		{
			System.out.println("Allowed to perform the data clean");
			
			System.out.println("User Name: "+userName);
			System.out.println("User Id: "+id);
			// 100 lines
		}
		else
		{
			System.err.println("Not allowed");
		}
	}

}
