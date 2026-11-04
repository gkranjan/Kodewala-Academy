package com.oops.encapsulation;

public class Driver {

	public static void main(String[] args) {

		BankAccount obj=new BankAccount();
		obj.deposit(500);
		obj.getBalance();
		System.out.println(obj.getBalance());
	}

}
