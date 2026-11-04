package com.oops.encapsulation3;

public class Driver {

	public static void main(String[] args) {

		ATM obj=new ATM();
		obj.deposit(500,"123");
		obj.withdraw(200,"123");
		obj.display("Gautam","45556666");
	}

}
