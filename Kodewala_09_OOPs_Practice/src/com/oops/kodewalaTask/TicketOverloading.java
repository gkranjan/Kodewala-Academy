package com.oops.kodewalaTask;

public class TicketOverloading {
	
	String name;
	String email;
	String phoneNumber;
	
	
    TicketOverloading() {
    	super();
    }
    
    TicketOverloading(String name)
    {
    	this.name=name;
    	
    	System.out.println("Name: "+name);
    }
    TicketOverloading (String name,String email)
    {
    	this.name=name;
    	this.email=email;
    	System.out.println("Name: " +name+ " Email: "+email);
    }
    TicketOverloading(String name,String email,String phoneNumber)
    {
    	super();
    	this.name=name;
    	this.email=email;
    	this.phoneNumber=phoneNumber;
    	System.out.println("Name: "+name);
    	System.out.println(" Email: "+email);
    	System.out.println(" PhoneNumber: "+phoneNumber);
    	
    }
    
	void ticket(String name)
	{
		System.out.println("Name: " +name);
	}
	
	void bookTicket()
	{
		System.out.println("Name: "+name+ "Email id: "+email);
	}
	
	 String  display ()//(String name,String email,String phoneNumber)
	{
		System.out.println("Name: "+name+ "Email id: "+email+ "Phone Number: "+phoneNumber);
		return "i am return";
	}

}

class TravellerAgent extends TicketOverloading
{

	public TravellerAgent(String name, String email, String phoneNumber) {
//		super(name, email, phoneNumber);
	}
	void redBusTicket(String name)
	{
		System.out.println("Method overloading"); 
		
		System.out.println("Name: " +name);
	}
	
	void redBusTicket(String name,int id)
	{
		System.out.println("Method overloading"); 
		
		System.out.println("Name: " +name);
	}
	
	void redBusTicket(int name)
	{
		System.out.println("Method overloading"); 
		
		System.out.println("Name: " +name);
	}
	
	void makeMyTripTicket(String name,String email)
	{
		System.out.println("Name: "+name+ "Email id: "+email);
	}
	
	void ticketDetails(String name,String email,String phoneNumber)
	{
		System.out.println("Name: "+name+ "Email id: "+email+ "Phone Number: "+phoneNumber);
	}
	
	
}
