package com.interfacePractice.polymorphism5;

public class BikeRide extends Ride{
	
	@Override
	double calculateFare(double distance)
	{
		return distance *10;
	}

}
