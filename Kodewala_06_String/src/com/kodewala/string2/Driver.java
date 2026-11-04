package com.kodewala.string2;

public class Driver {

	public static void main(String[] args) {

		String s1 = "Kodewala"; // SCP --> 123qwe

		String s2 = new String("Acedemy"); // one object int scp + one in heap--> 432vcx

		System.out.println(s1 == s2); // 123qwe == 432vcx--> false

		String s3 = new String("Kodewala");
		String s4 = new String("Kodewala");

		System.out.println(s4 == s3);

		System.out.println(s4.equals(s3)); // any letter will change in kodewala answer get false.
		// java is case sensitive language.
	}

}
