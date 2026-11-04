package com.kodewala.oops.abstraction_2;

public class Account {

	// responsible for opening an account
	// RBI --> one PAN can should not have more than 5 account.
	public boolean openAccount(String name, String address, String pan) // abstract
	{
		connectWithDB();
		validateNameAndAddress(name, address);
		validatePan(pan);
		findAccountByPanCard(pan); // enhanced
		createUserID();
		notifyUser();
		return true;
	}

	// Core functionalities
	private boolean validateNameAndAddress(String name, String address) {
		System.out.println("Account.validateNameAndAddress().. Validating name and address");
		return true;
	}

	// Core functionalities
	private boolean validatePan(String pan) {
		System.out.println("Account.validatePan() .. validating pan");
		return true;
	}

	// Core functionalities
	private void connectWithDB() {
		System.out.println("Account.connectWithDB().... DB connection");
	}

	// Core functionalities
	private String createUserID() {
		System.out.println("Account.createUserID()... creating user id... ");
		return "some User id....";
	}

	// Core functionalities
	private void notifyUser() {
		System.out.println("Account.notifyUser().... sending notification to user");
	}

	private int findAccountByPanCard(String pan) {
		System.out.println("Account.findAccountByPanCard()... finding total accounts");
		return 3;
	}

}
