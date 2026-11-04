package com.MarkerInterface.serializable2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("customer.txt");
		System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("File Exists: " + file.exists());
		FileInputStream fis = new FileInputStream(file);

		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Customer c = (Customer) ois.readObject();
		
		System.out.println(c.accountNumber);
		System.out.println(c.customerNumber);
		System.out.println(c.balance);

		ois.close();
		
		
	}

}
