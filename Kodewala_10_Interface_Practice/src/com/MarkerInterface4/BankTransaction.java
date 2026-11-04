package com.MarkerInterface4;

public class BankTransaction implements Auditable{
	
	int transactionId;
	double amount;
	
	BankTransaction(int id,double amount)
	{
		this.transactionId=id;
		this.amount=amount;
	}

}
