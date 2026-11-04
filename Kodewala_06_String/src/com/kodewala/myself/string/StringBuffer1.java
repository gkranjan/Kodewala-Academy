package com.kodewala.myself.string;

public class StringBuffer1 {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("Kodewala Acedemy,");
		
		sb.append(" BTM"); // stored in sb
		sb.append(", Bangalore"); // also stored in sb in next step
		
		System.out.println("Details: " +sb);  // Kodewala Acedemy BTM, Bangalore

	}

}
