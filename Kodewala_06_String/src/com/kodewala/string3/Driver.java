package com.kodewala.string3;

public class Driver {

	public static void main(String[] args) {

		String s = " Kodewala";// SCP

		// in case i want to change s

		String s2 = s.concat(" Academy"); // trying to change the object
											// object created in heap with content kodewala acedemy
		String s4 = s.concat(s2); // kodewala is two times

		// s3 for my experiment.
		String s3 = s.concat(" Bangalore").concat(s).concat(s2).concat(" Gautam");

		System.out.println(s2);
		System.out.println(s);
		System.out.println(s3);
		System.out.println(s4);
	}

}
