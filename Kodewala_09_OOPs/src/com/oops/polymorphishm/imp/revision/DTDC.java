package com.oops.polymorphishm.imp.revision;

public class DTDC extends Delivery{
	
	@Override
	public void doDelivery()
	{
		System.out.println("DTDC.doDelivery()....DTDC");
	}

	@Override
	public void doPayment()
	{
		System.out.println("Delivery.doPayment()...DeliveryPayment");
	}
}
