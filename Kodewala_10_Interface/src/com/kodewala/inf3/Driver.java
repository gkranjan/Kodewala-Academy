package com.kodewala.inf3;

public class Driver {

	public static void main(String[] args) {

//		IAccount account =new SavingAccount();
//		account.openAccount();
		
		/**
		 * this type call in lambda expression,if you have parameter then you use in (name of parameter), other wise only use ()->
		 * 
		 * -> this the sign of lambda expression
		 * lambda expression is only used for functional interface.because there only one abstract method.
		 * lambda is only focus in HOW part. logic in there in how part.
		 */
		
		// without arg use this.
//		IAccount account=()->
//		{
//			System.out.println("This call for lambda expression.....");
//		};
//		account.openAccount();
		
		
		/**
		 * with parameter you used it like this.
		 * also you write different name as you want in parameter section.
		 */
		
		IAccount account=(name,address,balance)->
		{
			System.out.println("Open account Name ..."+name);
			System.out.println("Open account location..."+address);
			System.out.println("Open account balance..."+balance);
			return " Account open";
		};
		
		account.openAccount("Gautam","BTM Bangalore", 5100000);
		
	}

}
