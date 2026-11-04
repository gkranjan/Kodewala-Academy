package com.interfacePractice.polymorphism5;

 class RideService {
	
	public void bookRide(Ride ride,double distance)
	{
		double fare = ride.calculateFare(distance);
		System.out.println("Ride fare: Rs. " +fare);
	}

}
