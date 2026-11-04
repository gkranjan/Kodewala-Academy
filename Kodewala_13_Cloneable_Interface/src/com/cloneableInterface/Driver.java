package com.cloneableInterface;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account acc= new Account("Kodewala Academy","BTM Bangalore","7845663333");
		// not need to multiple create object.only one used for multiple time with the help of cloneable.
		
		Account clonedObjOfAcc=(Account) acc.clone(); // trying to clone(xerox /copy)
		
		System.out.println(clonedObjOfAcc.accNo);
		
		if(acc instanceof Cloneable)
		{
			System.out.println("true.....allowed to perform the activity...");
		}
		else {
			System.out.println("false");
		}
	}

}
