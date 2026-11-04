package com.kodewala.controlFlow2;

public class Driver {

	public static void main(String[] args) {

		Driver driver = new Driver();
		int day = Integer.parseInt(args[0]); // command line input and parsing it.

		driver.identifyDay(day);

	}

	// Identify the day based on the number supplied.

	public void identifyDay(int number) {
		switch (number) {
		case 1:
			System.out.println("Mon");
			break;

		case 2:
			System.out.println("Tues");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;

		default:
			System.err.println("Please enter correct number!!");
			break;
		}
	}

}
