package com.kodewala.oops.inheritance5;

public class Products extends TataMotors{
	
	public void privateCar()
	{
		System.out.println("I follow the Hierarchial inheritance");
		System.out.println("I am the Private Car");
		this.commercialCar();
	}
	
	public void commercialCar()
	{
		System.out.println("I am the commerical cal");
	}

}
