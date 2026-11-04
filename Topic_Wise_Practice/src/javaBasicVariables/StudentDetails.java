package javaBasicVariables;

import java.util.Scanner;

public class StudentDetails {
	
	public static void main(String[] args) {
		
		/**
		 * 1st tipe source code.
		 */
//		System.out.println("Name : Gautam Kumar Ranjan");
//		System.out.println("Age: 27");
//		System.out.println("Course: Java Backend Developer");
		
		
		/**
		 * 2nd type source code.
		 */
//		String name="Gautam";
//		int age = 27;
//		String course = "Java Backend Developer";
//		
//		System.out.println("Student Details: " + name + "," + age +" ,"+ course);
		
		
		/**
		 * 3rd type source code.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		
				
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		sc.nextLine();// i don't know why here put,i think sequence seqence wise call.
		// also put this line in before the nextInt.
		
		System.out.println("Enter Course Name:");
		String course = sc.nextLine();
			
		System.out.println("Name: "+name);
		System.out.println("Age: " +age);
		System.out.println("Course Name: " +course);
	}

}
