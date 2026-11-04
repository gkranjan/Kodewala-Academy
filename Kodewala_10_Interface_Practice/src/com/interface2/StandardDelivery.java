package com.interface2;

public class StandardDelivery implements IDelivery{

	@Override
	public void calculateDeliveryCharge(double distance) {

		// Rs 5 per kilometer.charge
		double amount = distance*5;
		
		System.out.println("Your distance is: "+distance+"Km");
		System.out.println("According to your distance,Charge will be Rs. "+amount);
		System.out.println("Distance is "+distance+ "Km Charge is Rs."+amount);
	
	}

	@Override
	public void deliver() {

		
		System.out.println("Deliver in 5 Days");
		
	}
	
	

}
