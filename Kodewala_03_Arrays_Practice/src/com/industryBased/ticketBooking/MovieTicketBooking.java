package com.industryBased.ticketBooking;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean[] seats = new boolean[10];

		// false=Available,true =Booked

		System.out.println("===== MOVIE TICKET BOOKING =======");

		while (true) {
			System.out.println("\n1. View Available Seats");
			System.out.println("2. Book a Seat");
			System.out.println("3. Cancel Booking");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("=========SEAT STATUS==========");

				for (int i = 0; i < seats.length; i++) {
					if (seats[i] == false) {
						System.out.println("Seat " + (i + 1) + " : Available");
					} else {
						System.out.println("Seat " + (i + 1) + " : Booked");
					}
				}
				break;
			case 2:

				System.out.print("Enter seat number: ");
				int seatNumber = sc.nextInt();

				if (seatNumber < 1 || seatNumber > seats.length) {
					System.out.println("Invalid seat number!");
				} else if (seats[seatNumber - 1] == false) {

					seats[seatNumber - 1] = true;

					System.out.println("Seat booked successfully!");
					System.out.println("Booking Seat: " + seatNumber);
				} else {
					System.out.println("Seat already booked!");
				}

				break;

			case 3:

				System.out.print("Enter seat number to cancel: ");
				seatNumber = sc.nextInt();

				if (seatNumber < 1 || seatNumber > seats.length) {
					System.out.println("Invalid seat number!");
				} else if (seats[seatNumber - 1] == true) {

					seats[seatNumber - 1] = false;

					System.out.println("Booking cancelled successfully!");
				} else {
					System.out.println("This seat is not booked!");
				}

				break;

			case 4:

				System.out.println("Thank you for using our booking system!");
				sc.close();
				return;

			default:

				System.out.println("Invalid choice!");
			}
		}
	}

}
