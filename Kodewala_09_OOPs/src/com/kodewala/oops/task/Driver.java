package com.kodewala.oops.task;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.nextLine();
		
		System.out.println("Enter account number:");
		String acc=sc.nextLine();
		
		System.out.println("Enter Balance:");
		int bal=sc.nextInt();
		
		System.out.println("Enter transfer amount:");
		int amt=sc.nextInt();
		
		FundTransfer fund = new FundTransfer(name,acc,bal,amt);
		fund.getCredit();
	
	
		
		sc.nextLine();
		System.out.println("Enter name:");
		String name1=sc.nextLine();
		
		System.out.println("Enter account number:");
		String acc1=sc.nextLine();
		
		System.out.println("Enter Balance:");
		int bal1=sc.nextInt();
		
		System.out.println("Enter transfer amount:");
		int amt1=sc.nextInt();
		
		
		FundTransfer fund1 = new FundTransfer(name1,acc1,bal1,amt1);

		fund1.getCredit();
		
		sc.close();
	}
}
		
	



		//FundTransfer fund1 = new FundTransfer("Kumar","244587865",1100,200);
		//FundTransfer fund2 = new FundTransfer("Ranjan","68788946",1200,333);
		
		
//		fund1.transferMoney();
//		fund2.transferMoney();
		
		
//		fund.userDetailsDisplay();
//		fund.getCredit(500);
//		fund.getDebit(600);
//		fund.userDetailsDisplay();
//		fund.transferMoney(200);

