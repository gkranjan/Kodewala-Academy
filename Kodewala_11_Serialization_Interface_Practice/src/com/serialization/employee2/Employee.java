package com.serialization.employee2;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int employeeId;
	String employeeName;
	String department;
	double salary;

	public Employee(int employeeId, String employeeName, String department, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}

	public String toString() {
		return employeeId + " | " + employeeName + " | " + department + " | " + salary;
	}
}
