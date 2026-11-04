package com.kodewala.oops.task;

public class FundTransfer {

	private String accountHolderName;
	private String accountNumber;
	private int balance;
	private int amount;

	public FundTransfer(String accountHolderName, String accountNumber, int balance, int amount) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;

	}

	// 2. positive amount transaction allowed.
	public void getCredit() {

		if (amount > 0) {
			System.out.println("<========GetCredit========>");
			System.out.println("Thanks for positive amount.");
			balance = balance + amount;
			System.out.println("Amount credited:" + balance);

		} else if (amount < 0) {
			System.out.println("<======== Amount<0 ========>");
			System.out.println("You don't perform any task:");

		} else {
			System.out.println("<================>");
			System.err.println("Please enter valid amount!!!");

		}

		getDebit();
	}
	// 3. transfer amount should be less than or equal to current balance

	public void getDebit() {
		if (balance > amount && amount > 0) {
			System.out.println("<=======GetDebit=========>");
			System.out.println("Thanks for positive amount.");
			balance = balance - amount;
			System.out.println("Amount debited:" + balance);
		} else if (balance < 0) {
			System.out.println("<========GetDebit========>");
			System.out.println("You don't have sufficient amount.");
		} else {
			System.out.println("<========GetDebit========>");
			System.err.println("please check the balance first!!!");
		}
		userDetailsDisplay();
	}

	// Able to read userDetails
	public void userDetailsDisplay() {
		System.out.println("<=======UserDetail=========>");
		System.out.println("AccountHolderName:" + accountHolderName);
		System.out.println("AccountNumber:" + accountNumber);
		System.out.println("Last Actual Balance:" + balance);
		System.out.println("Your last transfer amount is:" + amount);

	}
}

//4.able to read
//5.positive amount transaction allowed.
