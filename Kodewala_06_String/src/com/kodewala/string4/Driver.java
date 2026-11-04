package com.kodewala.string4;

public class Driver {

	public static void main(String[] args) {

		String s1 = "This" + " is from" + " kodewala academy Bangalore";

		// String s1 = "This is from kodewala academy Bangalore";

		// System.out.println(s1);

		String s2 = "Kodewala"; // scp
		String s3 = "   Academy"; // scp

		String s4 = s2 + s3; // heap ---> new stringBuilder();

		// String s5= s2.concat(s3).toUpperCase();

//		char[] s6= s2.concat(s3).toCharArray();
//		System.out.println(s6);

		String s11 = "Kodwala Acedemy";

		// System.out.println(s11 == s4.intern()); // false

		// intern used for first check in scp there avialable or not its avilable then
		// reffer them otherwise copy in scp.

		String s7 = "Gautam";
		String s8 = "Kumar";
		String s9 = "ranjan";

		String s10 = new String("Ranjan");
		// System.out.println(s9 + s10.intern());
		Driver d = new Driver();
		Driver d1 = new Driver();

//		System.out.println(d);
//		System.out.println(d1);
//		
//		System.out.println(d.equals(d1));
//		

		// System.out.println(s9.equals(s10));

		System.out.println(s8 == s9);
	}

}
