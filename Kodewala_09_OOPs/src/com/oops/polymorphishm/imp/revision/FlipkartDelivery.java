package com.oops.polymorphishm.imp.revision;

public class FlipkartDelivery extends Delivery{
	@Override
	public void doDelivery()
	{
		System.out.println("FlipkartDelivery.doDelivery()......FlipkartDelivery");
	}
	
	@Override
	public void doPayment()
	{
		System.out.println("FlipkartDelivery.doPayment()...FlipkartDelivery");
	}
	
	// only for demo purpose i purforme this. just experiment how its works. 
	@Override
	public void cashPayment()
	{
		System.out.println("FlipkartDelivery.cashPayment()");
		
//		for(int i=0;i<=20;i++)
//		{
//			System.out.println("This number is:" +i);
//		}
	}

}
