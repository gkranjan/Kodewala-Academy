package com.kodewala.constructors3;

public class Driver {

	public static void main(String[] args) {
		
		// type refName =new Class();
		
		Account acc=new Account(); 	//Account ("Kodewala" ,300)
		
		System.out.println(acc.amount +" and "+ acc.name);
		
		
		Account acc1=new Account(2000,"Gautam");
		
		System.out.println(acc1.amount + " and " + acc1.name);


	}

}
