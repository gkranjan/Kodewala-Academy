package com.kodewala.oops.abstraction;

public class Account {

	public void accountDetails(String name, String address, String number,int order) {
		
		System.out.println(name+" "+address+" " +number +" "+order);
		orderDetails();
		addressChange();
		updateNumber();
	}

	private boolean  orderDetails() {
		
		System.out.println("Oder itehm is 50");
		//System.out.println(order + " " + name);
		return true;

	}

	private boolean addressChange() {
		System.out.println("only change address by admin");
		//System.out.println(name + " " + address);
		return true;
	}

	private boolean updateNumber() {
		System.out.println("Change number only admin");
		//System.out.println(name + " " + number);
		return true;
	}

}
