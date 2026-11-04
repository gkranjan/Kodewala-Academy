package com.string.passwordStrengthChecker;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Password:");
		String password =sc.nextLine();
		
		boolean upper = false;
		boolean lower =false;
		boolean digit = false;
		boolean special = false;
		
		for(int i=0;i < password.length();i++)
		{
			char ch = password.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				upper =true;
			}
			else if(Character.isLowerCase(ch))
			{
				lower = true;
			}
			
			else if(Character.isDigit(ch))
			{
				digit =true;
			}
			else 
			{
				special =true;
			}
		}
		if(password.length() >= 8 && upper && lower && digit && special)
		{
			System.out.println("Strong Password");
		}
		else
		{
			System.out.println("Weak password");
		}
		sc.close();
	}

}
