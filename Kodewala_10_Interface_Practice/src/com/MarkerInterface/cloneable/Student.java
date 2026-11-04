package com.MarkerInterface.cloneable;

public class Student implements Cloneable{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

}
