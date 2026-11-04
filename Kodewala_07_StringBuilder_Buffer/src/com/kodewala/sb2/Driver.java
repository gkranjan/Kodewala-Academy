package com.kodewala.sb2;

public class Driver {

	public static void main(String[] args) {
StringBuilder sb= new StringBuilder(" Kodewala"); // stringbuilder object--> mutable
		
		sb.append(" Academy"); 
		
		for(int i=0;i<=10;i++)
		{
			
			System.out.println(i+" " +sb);
		}
	}

}
