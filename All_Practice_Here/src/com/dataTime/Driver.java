package com.dataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Driver {

	public static void main(String[] args) {
		
		/**
		 * Display current date 
		 */
		LocalDate obj= LocalDate.now();
		System.out.println(obj);
		
		/**
		 * Display current time
		 */
		
		LocalTime obj2=LocalTime.now();
		System.out.println(obj2);
		
		
		/**
		 * Display current Date and Time
		 */
		LocalDateTime obj3= LocalDateTime.now();
		System.out.println(obj3);
		
		/**
		 * Formating the Date and Time
		 * like this:-  (2026-10-29T19:59:32.544022100)
		 */
		LocalDateTime obj4=LocalDateTime.now();
		System.out.println("Before formating: "+obj4);
		
		/**
		 * After formatting: 29-10-2026 19:59:32
		 */
		DateTimeFormatter obj5=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = obj5.format(obj4);
		System.out.println("Before formating: "+obj4);
		System.out.println("After formatting: " +formattedDate);
		
		/**
		 * After formatting: 2026-10-29 19:59:32
		 */
		DateTimeFormatter obj6=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate6 = obj6.format(obj4);
		System.out.println("Before formating: "+obj4);
		System.out.println("After formatting: " +formattedDate6);
		
		/**
		 * After formatting: 29/10/2026 19:59:32
		 */
		DateTimeFormatter obj7=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDate7 = obj7.format(obj4);
		System.out.println("Before formating: "+obj4);
		System.out.println("After formatting: " +formattedDate7);
		
		/**
		 * After formatting: 29-Oct-2026 19:59:32
		 */
		DateTimeFormatter obj8=DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String formattedDate8 = obj8.format(obj4);
		System.out.println("Before formating: "+obj4);
		System.out.println("After formatting: " +formattedDate8);
		
		/**
		 * After formatting: Thu,Oct 29 2026 19:59:32
		 */
		DateTimeFormatter obj9=DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");
		String formattedDate9 = obj9.format(obj4);
		System.out.println("Before formating: "+obj4);
		System.out.println("After formatting: " +formattedDate9);
		
	}

}
