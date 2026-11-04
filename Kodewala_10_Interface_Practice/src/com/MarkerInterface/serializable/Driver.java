package com.MarkerInterface.serializable;

import java.io.Serializable;

public class Driver {

	public static void main(String[] args) {

		Employee emp = new Employee();
		
		if(emp instanceof Serializable)
		{
			System.out.println("Object is Serializalbe");
		}
	}

}
