package com.kodewala.myself.string;

public class ReverseString {

	public static void main(String[] args) {

		
		String s="Gautam";
		
		String rev=new  StringBuilder(s).reverse().toString();
		System.out.println("Original String:- " +s);
		System.out.println("Reverse String:- " +rev);
	}

}
