package com.string.accountMasking;

import java.util.Scanner;

public class AccountMaskingDemo2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Number:");
		String account=sc.nextLine();
		
		if(account.matches("\\d{4,}"))
		{
			String lastFour=account.substring(account.length()-4);
			
			String masked= account.substring(0,account.length()-4).replaceAll(".", "X") +lastFour;
			
			System.out.println("Masked Account number: "+masked);
			
		}
		else
		{
			System.out.println("Invalid account number:");
		}
		sc.close();
	}

}
