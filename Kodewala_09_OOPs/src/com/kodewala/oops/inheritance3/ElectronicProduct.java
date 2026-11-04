package com.kodewala.oops.inheritance3;

public class ElectronicProduct extends Product {
	
	boolean isWarenty;
	int warrentyInYears;
	
	public ElectronicProduct(String productName, String describtion, int quantity, String status, boolean isWarenty,
			int warrentyInYears) {
		super(productName, describtion, quantity, status);
		this.isWarenty = isWarenty;
		this.warrentyInYears = warrentyInYears;
	}
	
	
	public void viewElectronicProductDetails()
	{
		
		System.out.println(productName);
		System.out.println(describtion);
		System.out.println( quantity);
		System.out.println(status);
		
		System.out.println(isWarenty);
		System.out.println(warrentyInYears);
	}

	
	
}
