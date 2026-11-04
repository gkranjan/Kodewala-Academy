package com.interface3;

public class Booking {
	
	private String bookingId;
	private String status;
	private String passangerName;
	private String source;
	private String destination;
	private double ticketPrice;
	private String paymentStatus;
	private String seatNumber;
	
	public String getBookingId()
	{
		return bookingId;
	}
	
	public void setBookingId(String bookingId)
	{
		this.bookingId=bookingId;
		System.out.println("BusBooking.setBookingId()");
		System.out.println("BusBooking.setBookingId()......"+bookingId);
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getStatus(String status)
	{
		this.status=status;
		
		
		System.out.println("BusBooking.getStatus()...."+status);
		return status;
	}
	
	public String getPassangerName()
	{
		return passangerName;
	}
	
	public String getPassangerName(String passangerName)
	{
		this.passangerName=passangerName;
		System.out.println("BusBooking.getPassangerName()......"+passangerName);
		return passangerName;
		
	}
	
	public String getSource()
	{
		return source;
	}
	
	public String getSource(String source)
	{
		System.out.println("BusBooking.getSource()......"+source);
		
		return source;
	}
	public String getDestination()
	{
		return destination;
		
	}
	public String getDestination(String destination)
	{
		System.out.println("BusBooking.getDestination()......"+destination);
		return destination;
	}
	public double getTicketPrice()
	{
		return ticketPrice;
		
	}
	
	public double getTicketPrice(double ticketPrice)
	{
		System.out.println("BusBooking.getTicketPrice()....."+ticketPrice);
		return ticketPrice;
	}
	
	public String getPaymentStatus()
	{
		return paymentStatus;
	}
	public void getPaymentStatus(String paymentStatus)
	{
		System.out.println("BusBooking.getPaymentStatus()......"+paymentStatus);
	}
	public String getSeatNumber()
	{
		return seatNumber;
	}

	public void getSeatNumber(String seatNumber)
	{
		System.out.println("BusBooking.getSeatNumber()......"+seatNumber);
	}
}
