package com.objectCreation.industryLevel2;

import com.objectCreation.industryLevel.EmployeeManagementSystem;

public class EmployeeManagement {

	public static void main(String[] args) {

		EmployeeManagementSystem emp1=new EmployeeManagementSystem();
		emp1.employeeId=101;
		emp1.employeeName="Gautam";
		emp1.salary=450000;
		
		
		
		EmployeeManagementSystem emp2=new EmployeeManagementSystem();
		emp2.employeeId=102;
		emp2.employeeName="Kumar";
		emp2.salary=500000;
		
		
		emp1.display();
		emp2.display();
	}

}
