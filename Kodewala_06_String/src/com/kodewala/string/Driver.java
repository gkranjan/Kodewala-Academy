package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {

		// Create a string object

		String firstName = "Kodewala"; // obj created in SCP -->firstName's address-->xyz321
		String lastName = "Kodewala"; // object with content "kodewala" already created
										// and lastName will refer to existing object.
										// LastName is also pointing to address xyz321
		String last1 = "Kodewala";
		String last2 = "Kodewala";

		String city = new String("Bangalore");
		String city1 = new String("Bangalore");

		System.out.println(firstName == lastName); // == will campare the address of an object.

		System.out.println(last1 == last2);

		System.out.println(city == city1);
	}

}
