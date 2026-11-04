package com.kodewala.constructors7;

public class Driver {
	public static void main(String[] args) {
		
		ElectronicProduct obj=new ElectronicProduct("Gautam",180000,"IPhone",2);
		
		
		System.out.println(obj.name);
		System.out.println(obj.product);
		System.out.println(obj.price);
		System.out.println(obj.warrenty);
		
		
		BeautyProduct obj2=new BeautyProduct("Ranjan",2000,"Cream",5);
		System.out.println(obj2.name);
		System.out.println(obj2.price);
		System.out.println(obj2.product);
		System.out.println(obj2.expire);


		
	}

}
