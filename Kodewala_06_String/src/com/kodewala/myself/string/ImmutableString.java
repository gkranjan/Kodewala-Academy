package com.kodewala.myself.string;

public class ImmutableString {

	public static void main(String[] args) {

		String s1="Kodewala";
		String s3="Kodewala Academy";
		String s2=s1.concat(" Academy");
		
		System.out.println("s1:" +s1);
		System.out.println("s2:" +s2);
		
		System.out.println("Are s1 and s2 the same ? :" +(s3==s2)); //output :false
		
		
		System.out.println("Are s1 and s2 the same ? :" +(s3.equals(s2))); //True
	}

}
