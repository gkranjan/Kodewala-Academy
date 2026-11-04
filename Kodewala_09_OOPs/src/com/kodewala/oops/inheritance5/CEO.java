package com.kodewala.oops.inheritance5;

public class CEO extends TataMotors{
	
	public void manager()
	{
		System.out.println("Mutilevel iheritance");
		super.car();
		System.out.println("Manager");
		this.employees();
	}
	
	public void employees()
	{
		System.out.println("Employess");
	}
	

}
