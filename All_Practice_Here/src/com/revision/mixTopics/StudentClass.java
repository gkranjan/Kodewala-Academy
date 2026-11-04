package com.revision.mixTopics;

public class StudentClass {
	
	static class Student{
	
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	String result()
	{
		return name.toUpperCase() +": "+(marks >= 40 ? "Pass" : "Fail");
	}
	}
	
	public static void main(String[] args) {
		
		Student[] students= { 
				new Student("Asha",82),
				new Student("Ravi",35),
				new Student("Neha",67)
							};
		
		for(Student student : students)
		{
			System.out.println(student.result());
		}
		}
	}
	


