package com.interfacePractice.polymorphism5;

public class CarRide extends Ride{
	
	@Override
	double calculateFare(double distance)
	{
		return distance *20;
	}

}
