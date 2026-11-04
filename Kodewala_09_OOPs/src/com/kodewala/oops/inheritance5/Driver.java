package com.kodewala.oops.inheritance5;

public class Driver {

	public static void main(String[] args) {
		// Sigle
		TataMotors tata=new TataMotors();
		tata.car();
		
		//Multilevel
		CEO obj=new CEO();
		obj.manager();
		
		
		//Hierarical
		Products product=new Products();
		product.privateCar();
		
		
		
		
	}

}
