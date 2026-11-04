package com.serialization.employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee emp = (Employee) ois.readObject();

		System.out.println("Employee ID: " + emp.employeeId);
		System.out.println("Employee Name: " + emp.employeeName);
		System.out.println("Employee salary: " + emp.salary);

		ois.close();
		fis.close();
	}

}
