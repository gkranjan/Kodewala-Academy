package com.kodewala.sb;

public class Driver {

	public static void main(String[] args) {

		StringBuilder sb= new StringBuilder("Kodewala"); // stringbuilder object--> mutable
		
		sb.append(" Academy");  // there created 3 object.
		System.out.println("append will modify that object not create new object,there 3 objects."); 
	
		sb.append(" Bangalore");
		
		System.out.println(sb);
	}

}
