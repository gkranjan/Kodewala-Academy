package com.MarkerInterface.serializable3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeDemo {

	public static void main(String[] args)  throws Exception{
		
		Employee e= new Employee(101,"Gautam",45000);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"));
		
		oos.writeObject(e);
		oos.close();
		System.out.println("Employee data saved successfully");

		
	}

}
