package com.MarkerInterface4;

public class AuditDemo {

	public static void main(String[] args) {

		BankTransaction t = new BankTransaction(501,25000);
		
		if(t instanceof Auditable)
		{
			System.out.println("Transaction Id: " +t.transactionId);
			
			System.out.println("Amount: " +t.amount);
			System.out.println("Audit Log Required");
		}
		else
		{
			System.out.println("Audit Not Required");
		}
	}

}
