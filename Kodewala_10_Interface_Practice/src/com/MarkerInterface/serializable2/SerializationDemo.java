package com.MarkerInterface.serializable2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args)  throws Exception{

		Customer c = new Customer(101,"Gautam",50000);
		
		FileOutputStream fos = new FileOutputStream("customer.txt");
		
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		oos.writeObject(c);
		
		oos.close();
		fos.close();
		System.out.println("Object serialized successfully");
		
	}

}
