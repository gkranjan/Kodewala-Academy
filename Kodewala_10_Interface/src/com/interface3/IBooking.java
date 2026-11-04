package com.interface3;

/**
 * in 2010
 */
interface IBooking {

	// What to do.?

	public abstract void cancleBooking();

	public abstract void chackStatus();

	SearchResult search();

	public Booking bookingStatus(); // BusBooking class implement and other only declare them.,but 100% declare the
									// all implemented class.

	public default void autoUpgarde() // only those who want and need this method/functionality.
	{
		connectingDB();
	}

	/**
	 * java 8 and after used default keyword. for who want to use this method,those
	 * not want then leave it this method. also choice option. but in interface
	 * implement is compalssory.
	 */
	// optional 2020
	public default void autoCancel() // only those who want and need this method/functionality.
	{
		connectingDB();

		// 500 lines (Check status,connectingwith database(25 lines),upgrading)
	}

	public default void sendNotification() {
		// 200 lines (connecting with database(25 lines),get user details and send
		// notification)
		System.out.println("IBooking.sendNotification().......");
	}

	/**
	 * Those who want to implement it ,not forcing them. introduce in java 8
	 * 
	 * @param path
	 * @param contents
	 */
	// common or utillity method.
	public static void printTicket(String path, String contents) {

		// 200 lines --> printing the ticket
		System.out.println("IBooking.printTicket().......static Method "+path+" ,"+contents);

	}

	// private used in java 9
	private void connectingDB() {
		System.out.println("IBooking.connectingDB()...use private");
		System.out.println("I used the private method with the help of other method");
	}

}
