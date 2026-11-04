package com.serialization.employee2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmployeeSerialization {

	public static void main(String[] args) {

		ArrayList<Employee> empployees = new ArrayList<>();
		
		empployees.add(new Employee(101,"Rahul","IT",45000));
		empployees.add(new Employee(102,"Priya","Finance",55000));
		empployees.add(new Employee(103,"Gautam","Finance",80000));
		
		// Serialization
		try {
			FileOutputStream fos= new FileOutputStream("employees.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(empployees);
			oos.close();
			
			System.out.println("Employee data saved successfully.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		// De-Serialization
		
		try
		{
			FileInputStream fis = new FileInputStream("employees.dat");
			ObjectInputStream ois =new ObjectInputStream(fis);
			
			ArrayList<Employee> savedEmployees = (ArrayList<Employee>) ois.readObject();
			
			System.out.println("\nEmployee Records:");
			for(Employee emp : savedEmployees)
			{
				System.out.println(emp);
			}
			ois.close();
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
