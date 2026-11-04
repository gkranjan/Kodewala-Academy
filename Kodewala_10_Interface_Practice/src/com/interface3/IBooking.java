package com.interface3;

/**
 * in 2010
 */
interface IBooking {

	// What to do.?

	
	public abstract void cancleBooking();

	public abstract void chackStatus();

	SearchResult search();
	
	public Booking bookingStatus(); // BusBooking class implement and other only declare them.,but 100% declare the all implemented class.
	
	public default void autoUpgarde()  // only those who want and need this method/functionality.
	{
		
	}
	/**
	 * java 8 and after used default keyword.
	 * for who want to use this method,those not want then leave it this method. also choice option.
	 * but in interface implement is compalssory.
	 */
	public default void autoCancel()  // only those who want and need this method/functionality.
	{
		
	}

}
