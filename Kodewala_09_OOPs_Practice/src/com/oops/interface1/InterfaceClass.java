package com.oops.interface1;

interface Printable
{
void print();	

}


class Report implements Printable
{
public void print()	
{
	
System.out.println("Report printed");
}
}

public class InterfaceClass {
	public static void main(String[] args) {
		
	

	new Report().print();
}
}
