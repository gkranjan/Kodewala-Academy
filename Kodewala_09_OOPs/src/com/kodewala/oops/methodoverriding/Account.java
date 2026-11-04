package com.kodewala.oops.methodoverriding;

class SavingAccount {

	public String openAccount(String name, int initBal) {
		// some... 100 lines of code--->
		System.out.println("Account.openAccount()");
		return "some string";
	}

}

public class Account extends SavingAccount {
	// 1. method name should be same.
	// 2. Type , order and number of args should be same.
	// 3. Return type sholuld be same execpt covarient
	// 4. Acces modifiier ---> should be same or widen(public -->public,
	// protected --> protected or public )
	@Override // you are telling compiler the i ma overriding the method.please check all the rules.
	public String openAccount(String _name, int _initBal) {

		// 200 lines of the code-->
		System.out.println("SavingAccount.openAccount()");
		return "some other string";
	}

	public static void main(String[] args) {

		Account account = new Account();
		account.openAccount("Gautam", 5);

		// System.out.println(account.openAccount("Gautam", 5));
	}
}
