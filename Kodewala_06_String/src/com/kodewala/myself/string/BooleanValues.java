package com.kodewala.myself.string;

public class BooleanValues {

	public static void main(String[] args) {

		String s1="Kodewala";
		String s2="Kodewala";
		
		String s3=new String("Kodewala");
		String s4=new String("Kodewala");
		
		
		System.out.println("s1==s2:=" +(s1==s2)); //true
		System.out.println("s3==s4:=" +(s3==s4)); //false
		System.out.println("s1==s3:=" +(s1==s3)); // false

		
		
		System.out.println("s1.equals(s2):= " + s1.equals(s2)); //true
		System.out.println("s3.equals(s4):=" + s3.equals(s4)); // true
		System.out.println("s1.equals(s3):= " + s1.equals(s3)); //true
	}

}
