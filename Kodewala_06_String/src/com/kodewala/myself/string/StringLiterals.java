package com.kodewala.myself.string;

public class StringLiterals {

	public static void main(String[] args) {

		String s1= new String("Kodewala");
		String s2=new String("Kodewala");
		String s3="kodewala";
		
		// false ,because each new string creates a distinct object on the heap.
		System.out.println("S1==s2:" + (s1==s2)); 
		
		
		System.out.println("s1.equal(s3) :" + (s1.equals(s3)));
		// true, because (.equals) compares content, not references.
	}

}
