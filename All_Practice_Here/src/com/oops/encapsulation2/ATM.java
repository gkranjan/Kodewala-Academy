package com.oops.encapsulation2;

public class ATM {

	private String pin = "123";
	private double balance = 5000;

	public ATM(String pin, double balance) {
		super();
		this.pin = pin;
		this.balance = balance;
	}

	public double getBalance() {
		System.out.println("Opening Balance is:" + balance);
		return balance;
	}

	public void getCredit(int _amount) {

		if (pin == "123") {
			System.out.println("PIN match credit your amount!!");

			balance += _amount;

			System.out.println("Credit amount is:" + _amount);
			System.out.println("After credit:" + balance);

		}

		else {
			System.out.println("PIN doesn't match you cann't deposit balance!!!!");
		}

	}

	public void withdraw(int _amount) {

		if (pin == "123") {

			double bal = balance - _amount;
			if (bal > 0 && _amount < bal) {
				System.out.println("PIN match countinue withdraw balance!!");

				System.out.println("Debited Amount is:" + _amount);

				System.out.println("After withdraw balance:" + bal);
			}

		} else {
			System.out.println("PIN mismatch!! Try again!!!");
		}

	}

	public void displayUserDetail(String name, String accountnumber) {

		System.out.println("Name:" + name);
		System.out.println("Account number:" + accountnumber);

		System.out.println("Closing Balance is:" + balance);
	}

}
