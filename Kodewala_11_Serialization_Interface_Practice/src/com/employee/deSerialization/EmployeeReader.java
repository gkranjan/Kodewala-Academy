package com.employee.deSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.employee.model.Employee;

public class EmployeeReader {
	
	public static void main(String[] args) {
		try
		{
			FileInputStream fis = new FileInputStream("employee.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee) ois.readObject();
			
			System.out.println("Employee data retrieved:");
			emp.displayEmployee();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
