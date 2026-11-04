package com.oops.kodewalaTask;

/**
 * Method overloading without child class (Extends) creating this called be the
 * method overloading
 */
class Registration {
	void doRegistration(String aadhar) {
		System.out.println("Registration using Aadhar:" + aadhar);
	}

	void doRegistration(String name, String aadhar) {

		System.out.println("Registration using Name and Aadhar:" + name + " Aadhar No" + aadhar);

	}

	void doRegistration(int id, String number) {
		System.out.println("Registration using Aadhar id and number:" + " \n ID: " + id + " Number: " + number);
	}

	void doRegistration(int id, String name, String address, String home) {
		System.out.println(" Registration using Aadhar id , name , address and home:" + "\n ID: " + id + "\n Name: "
				+ name + "\n Address: " + address + "\n Home: " + home);

	}
}

/**
 * Method Overridden With subclass(Extends) use the same method name and args
 * with pass different values .this is called methodOverridden.
 */
class Registration2 extends Registration {

	@Override
	void doRegistration(String aadhar) {
		System.out.println("Registration using Aadhar:" + aadhar);
	}

	@Override
	void doRegistration(String name, String aadhar) {

		System.out.println("Registration using Name and Aadhar:" + name + " Aadhar No" + aadhar);

	}

	@Override
	void doRegistration(int id, String number) {
		System.out.println("Registration using Aadhar id and number:" + " \n ID: " + id + " Number: " + number);
	}

	@Override
	void doRegistration(int id, String name, String address, String home) {
		System.out.println(" Registration using Aadhar id , name , address and home:" + "\n ID: " + id + "\n Name: "
				+ name + "\n Address: " + address + "\n Home: " + home);

	}
}

public class MethodOverloadingEaxample {

	public static void main(String[] args) {

		Registration registration = new Registration();
		registration.doRegistration(1, "Gautam", "Banka_Bihar", "Gora");
		registration.doRegistration(2, "Kumar", "Banka", "Gora");
		registration.doRegistration(3, "Ranjan", "Bihar", "Katoriya");

		
		Registration2 registration2 = new Registration2();
		registration2.doRegistration(4, "Aarush", "Jharkhand", "Deoghar");
		registration2.doRegistration(5, "Kumar", "Patna", "Deoghar");
		registration2.doRegistration(6, "Yadav", "Delhi", "MalviyaNagar");

	}
}
