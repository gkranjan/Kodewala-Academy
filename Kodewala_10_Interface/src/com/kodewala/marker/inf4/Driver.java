package com.kodewala.marker.inf4;

public class Driver {

	public static void main(String[] args) {

		User user=new User("Gautam","01");
		
		DataCleaner clean=new DataCleaner("Ram","02");
		clean.clean(user);
		
		//user.display();
		
		
	}

}
