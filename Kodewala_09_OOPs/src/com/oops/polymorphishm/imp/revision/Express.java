package com.oops.polymorphishm.imp.revision;

public class Express extends Delivery{
	@Override
	public void doDelivery()
	{
		System.out.println("Express.doDelivery()......Express");
	}
	@Override
	public void doPayment()
	{
		System.out.println("Delivery.doPayment()...DeliveryPayment");
	}
	
	
}