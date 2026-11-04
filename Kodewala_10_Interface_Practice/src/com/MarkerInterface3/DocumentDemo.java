package com.MarkerInterface3;

public class DocumentDemo {

	public static void main(String[] args) {

		CompanyDocument doc = new CompanyDocument("EmployeeSalaryReport");
		
		if(doc instanceof Confidential)
		{
			System.out.println("Confidential Document");
			System.out.println("Access Restricted");
		}
		else
		{
			System.out.println("Public Document");
		}
	}

}
