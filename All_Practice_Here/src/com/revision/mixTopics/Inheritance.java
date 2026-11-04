package com.revision.mixTopics;

public class Inheritance {

	static class Person {
		String name;

		Person(String name) {
			super();
			this.name = name;
		}

		String introduce() {
			return "I am " + name;
		}

	}

	static class Student extends Person {
		int rollNumber;

		Student(String name, int rollNumber) {
			super(name);
			this.rollNumber = rollNumber;
		}

		String details() {
			return introduce() + ", roll=" + rollNumber;
		}
	}

	public static void main(String[] args) {
		Student[] group = { new Student("Aman", 12), new Student("Sara", 15) };

		for (Student s : group) {
			System.out.println(s.details().toUpperCase());
		}
	}

}
