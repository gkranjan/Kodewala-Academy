package com.serialization.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee(101,"Gautam",45000);
		
		FileOutputStream fos= new FileOutputStream("employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
	
		oos.writeObject(emp);
		
		oos.close();
		fos.close();
		System.out.println("Employee object serialized successfully!");
	}
	

}
