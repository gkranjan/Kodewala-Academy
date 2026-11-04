package com.kodewala.string;

class User {
	String firstName;

	public User(String _firstName) {
		super();
		this.firstName = _firstName;

	}

}

public class Driver2 {

	public static void main(String[] args) {

		String city = "Bangalore"; // one Object created--->abc123
		String city1 = "Bangalore"; // one Object created--->abc123
		String city2 = "Bangalore"; // one Object created--->abc123
		String city3 = "Bangalore"; // one Object created--->abc123
		String city4 = "Bangalore"; // one Object created--->abc123

		// System.out.println(city==city1);

		// System.out.println(city1.equals(city4));

		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");

		System.out.println(user1.equals(user2));
	}

}
