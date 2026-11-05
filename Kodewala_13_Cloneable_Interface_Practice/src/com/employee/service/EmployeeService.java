package com.employee.service;

import com.employee.model.Employee;

public class EmployeeService {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10,"Gautam",45000);
		
		try
		{
			Employee emp2 = (Employee) emp1.clone();
			
			System.out.println("Original Employee:");
			emp1.display();
			
			System.out.println("\nCloned Employee:");
			emp2.display();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
