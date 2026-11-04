package com.employee.model;

import java.io.Serializable;

public class Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int employeeId;
	private String employeeName;
	private String department;
	private double salary;
	public Employee(int employeeId, String employeeName, String department, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee ID: " +employeeId);
		System.out.println("Employee Name: " +employeeName);
		System.out.println("Department: "+department);
		System.out.println("salary: "+salary);
	}
	
}
