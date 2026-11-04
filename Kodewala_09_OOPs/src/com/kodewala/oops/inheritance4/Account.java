package com.kodewala.oops.inheritance4;

class Account {
	public void openAccount(String UserId, String email) {
		System.out.println("Account.openAccount()");
	}

}

class SavingAccount extends Account {
	@Override
	public void openAccount(String UserId, String email) {
		System.out.println("SavingAccount.openAccount()");
	}

}

class SrCitAccount extends SavingAccount {
	@Override
	public void openAccount(String UserId, String email) {
		System.out.println("SrCitAccount.openAccount()");
	}}

	

	class PensionAccount extends SrCitAccount{

	@Override
	public void openAccount(String UserId, String email) {
		System.out.println("PensionAccount.openAccount()");
	}
}
