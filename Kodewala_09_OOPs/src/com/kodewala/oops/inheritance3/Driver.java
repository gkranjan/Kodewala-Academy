package com.kodewala.oops.inheritance3;

public class Driver {

	public static void main(String[] args) {

//		Product obj=new Product("I phone","First order",2,"In Stock");
//		obj.viewProductDetails();

		ElectronicProduct obj2 = new ElectronicProduct("I phone", "First order", 2, "In Strock", true, 2);
		obj2.viewElectronicProductDetails();
		
		ClothingProduct obj3=new ClothingProduct("I phone", "First order", 2, "In Strock",5,7);
		obj3.viewClothingProductDetails();
	}

}
