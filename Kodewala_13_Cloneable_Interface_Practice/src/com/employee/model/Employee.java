package com.employee.model;

public class Employee implements Cloneable{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public void display()
	{
		System.out.println("Employee ID: " +employeeId);
		System.out.println("Employee Name: " +employeeName);
		System.out.println("Salary: " +salary);
	}
	
	

}
