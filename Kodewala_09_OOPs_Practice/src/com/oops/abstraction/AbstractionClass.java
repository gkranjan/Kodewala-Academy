package com.oops.abstraction;

abstract class Payment
{
abstract void pay();

}
class UPI extends Payment
{
	void pay()
	{
		System.out.println("Paid by UPI");
	}
}

public class AbstractionClass {

	public static void main(String[] args) {
		Payment p=new UPI();
		p.pay();
	}
}
