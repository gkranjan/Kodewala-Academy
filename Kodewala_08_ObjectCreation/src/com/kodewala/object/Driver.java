package com.kodewala.object;

import com.kodewala.objects2.Account;
import com.kodewala.objects2.User;

public class Driver {
	public static void main(String[] args) {
		
		
		
		System.out.println("Start");
		
		User us=new User("Gautam","kw01","70143327652");
//		User us2=new User("Gautam","kw01","70143327652");
//		User us3=new User("Gautam","kw01","70143327652");
//		User us4=new User("Gautam","kw01","70143327652");
//		User us5=new User("Gautam","kw01","70143327652");
		
		Account ac=new Account("5949646");
		//Account ac1=new Account("5949646");
		//Account ac2=new Account("5949646");
		
		System.out.println("End");
		
		us.display();
		
		System.out.println(us.name);	
		
		
	}

}
