package com.kodewala.arrays1;

public class Driver2 {

	public static void main(String[] args) {
		
		DriverMain user1=new DriverMain("kodewala","4645689089");
		DriverMain user2=new DriverMain("gauta","34549089");
		DriverMain user3=new DriverMain("kumar","25456489089");
		DriverMain user4=new DriverMain("ranjan","435349089");
		DriverMain user5=new DriverMain("hello","454646");
		
		// store array
		DriverMain user[] =new DriverMain[5];
		
		user[0] =user1;
		user[1] =user2;
		user[2] =user3;
		user[3] =user4;
		user[4] =user5;
		
		user[2].display();
	}

}
