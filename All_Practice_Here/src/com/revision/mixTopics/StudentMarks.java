package com.revision.mixTopics;

public class StudentMarks {

	public static void main(String[] args) {

		String student ="Gautam";
		int [] marks = {78,85,62,90,75};
		int total=0;
		
		
		for(int mark : marks)
		{
			total += mark;
			
		}
		
		double average = (double) total / marks.length;
		boolean passed = average >= 40;
		
		System.out.println(student.toUpperCase());
		System.out.println("Total:" +total);
		System.out.println("Average:" +average);
		System.out.println("Passed:" +passed);
	}

}
