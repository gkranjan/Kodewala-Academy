package com.kodewala.constructors6;

public class Uber {

	String name;
	String type;
	int number;
	String country;
	
	
	Uber(String _name , String _type , int _number , String _country)
	{
		this.name= _name;
		this.type= _type;
		this.number= _number;
		this.country=_country;
		
		
	}
	
		public Uber()
		{
			
			// System is setting  / inslize default values;
			this("Guest123", "Guest_User", 701432765, "IN");
		}
}
