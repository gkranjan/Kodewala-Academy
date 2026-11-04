package com.kodewala.constructors3;

public class Account {

	
		
		int amount; //person 1--> 200,person 2-->10000
		String name;
		
		// if developer is not proving any constructor in a class the compiler
		//constructor(no arg constructor)
		
		Account()
		{
			System.out.println("inside first constructor:");
			//this.amount=_amount1;
			//this.name=_name1;
			
		}
		
		Account(int _amount , String _name)
		
		{
			
			System.out.println("Inside second constructor:");
			
			this.amount =_amount;
			this.name =_name;
		}

	

}
