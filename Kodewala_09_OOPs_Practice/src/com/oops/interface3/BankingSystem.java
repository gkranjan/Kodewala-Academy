package com.oops.interface3;

interface BankServices
{
	void deposit(double amount);
}
interface LoanServices
{
	void applyLoan(double amount);
}

class Customer implements BankServices,LoanServices
{
	public void deposit(double amount)
	{
		System.out.println("Deposited: " +amount);
	}
	
	public void applyLoan(double amount)
	{
		System.out.println("Loan applied for: "+amount);
	}
}
public class BankingSystem {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.deposit(5000);
		customer.applyLoan(8000000);
		
	}

}
