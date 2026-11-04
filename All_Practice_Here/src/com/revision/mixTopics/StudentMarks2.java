package com.revision.mixTopics;

public class StudentMarks2 {

	public static void main(String[] args) {

		String name="Gautam";
		int [] marks = {75,52,36,90};
		
		int total= 0;
		
		for(int mark:marks)
		{
			total += mark;
		}
		
		double average= total / marks.length;
		boolean passed = average >50;
		
		
		System.out.println("Name:" +name.toUpperCase());
		System.out.println("Total Marks: " +total);
		System.out.println("Average Marks: " +average);
		System.out.println("Passed: " +passed);
		
		
	}

}
