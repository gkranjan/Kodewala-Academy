package com.oops.polymorphism.overloading;

public class Payment {
	
	static int value=300; // only practice purpose
	final String NAME="GAUTAM"; // only practice purpose
	final int MAX_VALUES=1234;
	int a = MAX_VALUES; // Decalared as this.
	
	

	
	
	void processPayment(int amount) // Method with one parameter(Processing payment by amount)
	{
		System.out.println("Processing payment of " +amount);
	}
	
	void processPayment(String upiID,int amount) // Method with two parameters(Processing payment using UPI.)
	{
		System.out.println("Processing UPI Payment of" +amount+ "from UPI ID:" +upiID);
		System.out.println(value);
	}
	
	/**
	 * Method with different parameter order(processing cash payment with confirmation)
	 * 
	 * @param confirmation
	 * @param amount
	 */
	void processPayment(boolean confirmation,int amount) 
	{
		System.out.println("Processing cash payment of " +amount+ " with confirmation: " +confirmation);
	}
/**
 * This is not method overloading,(Method name is not be same) i create only for practice.
 * 
 * @param name
 * @param balance
 * @param emails
 */
	void processPaymentDriver(String name,int balance,String emails)
	{
		int otherValue=5000;
		System.out.println(name+","+balance+","+emails);
		
		
		System.out.println(value); // only for practice and demo purpose
		System.out.println(NAME);  // only for practice and demo purpose
		String other = NAME.concat(name);  // only for practice and demo purpuse
		
		System.out.println(other+","+otherValue+","+MAX_VALUES);
	}
}
