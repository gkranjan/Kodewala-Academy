package com.MarkerInterface.serializable3;

import java.io.Serializable;

public class Employee implements Serializable { // Serializable is a interface
	
	private static final long serialVersionUID = 1L;
	
	int employeeId;
	String employeeName;
	double salary;
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
}
