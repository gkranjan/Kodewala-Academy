package com.kodewala.oops.ploymorphism2;

public class DebitCardPayment extends Payment {
	
	@Override
	public void doPayment() 
	{
		System.out.println("DebitCardPayment.doPayment()....... DebitCardPayment ");
	}

}
