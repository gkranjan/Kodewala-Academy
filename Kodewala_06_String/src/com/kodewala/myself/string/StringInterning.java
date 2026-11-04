package com.kodewala.myself.string;

public class StringInterning {

	public static void main(String[] args) {

		String s1="Kodewala Academy";
		
		String s2=new String("Kodewala Academy");
		
		System.out.println(s1==s2);
		
		String s3=s2.intern(); // Same content  here "Kodewala Academy"
		
		//Interning s2: This checks the scp and returns the reference to the string in the pool.
		System.out.println(s1==s3);
	}

}
