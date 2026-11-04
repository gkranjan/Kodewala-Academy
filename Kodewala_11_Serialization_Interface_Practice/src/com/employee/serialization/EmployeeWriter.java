package com.employee.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.employee.model.Employee;

public class EmployeeWriter {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(101,"Rahul","IT",45000);
		
		try
		{
			FileOutputStream fos = new FileOutputStream("employee.dat");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
			oos.close();
			fos.close();
			System.out.println("Employee data serialized successfully.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
