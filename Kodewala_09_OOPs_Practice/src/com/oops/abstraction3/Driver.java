package com.oops.abstraction3;

public class Driver {

	public static void main(String[] args) {

		Bank obj =new HDFC(); //using Bank reference,unware of exect implementation
		obj.loanInterestRate();
	}

}
