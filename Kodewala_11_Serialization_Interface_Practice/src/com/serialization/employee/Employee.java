package com.serialization.employee;

import java.io.Serializable;

public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	int employeeId;
	String employeeName;
	double salary;
	
	public Employee(int employeeId,String employeeName,double salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		
	}
	
	

}
