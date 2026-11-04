package com.oops.objectCreation;

public class BookName {

	String name;
	int age;

	void display() {
		System.out.println("Name:" + name + " -> Age:" + age);
	}

	public static void main(String[] args) {

		BookName obj = new BookName();
		obj.name = "Gautam";
		obj.age = 28;
		obj.display();

	}
}
