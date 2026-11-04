package com.kodewala.scan;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	// creates connection with console.

	System.out.println("Enter the name:");
	String name= sc.nextLine();	//reading string input
	
	System.out.println("enter your number:");
	int number= sc.nextInt(); // reading int --> this will leave new line char \n
	
	sc.nextLine();// consume the extra char
	
	System.out.println("Enter address:");
	String address =sc.nextLine();
	
	//String address =sc.next(); // consume single char
	
	
	System.out.println("your name is:"+name);
	System.out.println("Your number is:"+number);
	System.out.println("your address is :" +address);
	
	sc.close();// close the connection.
}
}
