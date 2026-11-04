package com.kodewala.oops.inheritance3;

public class ClothingProduct extends Product {
	
	int returnday;
	int refundMoney;
	
	
	
	public ClothingProduct(String productName, String describtion, int quantity, String status, int returnday,
			int refundMoney) {
		super(productName, describtion, quantity, status);
		this.returnday = returnday;
		this.refundMoney = refundMoney;
	}



	public void viewClothingProductDetails()
	{
		
		System.out.println(productName);
		System.out.println(describtion);
		System.out.println( quantity);
		System.out.println(status);
		
		System.out.println(returnday);
		System.out.println(refundMoney);
	}

}
