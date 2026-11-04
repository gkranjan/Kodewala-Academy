package com.MarkerInterface.cloneable;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student(101,"Rahul");
		
		Student s2 = (Student) s1.clone();
		
		System.out.println("Original: " +s1.studentName);
		System.out.println("Copied: "+s2.studentName);
		
		System.out.println(s1==s2); 

		
	}

}
