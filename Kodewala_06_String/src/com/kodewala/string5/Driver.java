package com.kodewala.string5;


class AccountMgmt // this class can not become parent
{
	 int UPI_LIMIT =100000; //Constant in java



public final void doSomething1()
{
	UPI_LIMIT = 20000;  // able to change the values
	
	System.out.println("Enter something1 to change method.");
	System.out.println(UPI_LIMIT);
}


public void doSomething2()
{
	
	System.out.println("some changes");
	//some func.....android
}
}


class Account extends AccountMgmt
{
	@Override
	public void doSomething2()
	{
		System.out.println("Enter override");
		System.out.println(UPI_LIMIT);
	}
}
public class Driver {

	public static void main(String[] args) {

		AccountMgmt obj = new AccountMgmt();
		obj.doSomething1();
		obj.doSomething2();
		
		Account obj1= new Account();
		obj1.doSomething2();
		
	}

}
