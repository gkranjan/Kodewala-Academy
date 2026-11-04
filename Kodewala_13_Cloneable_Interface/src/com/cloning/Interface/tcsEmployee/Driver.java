package com.cloning.Interface.tcsEmployee;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address1=new Address("Kodewala","BTM","Bangalore");

		Employee emp=new Employee("Gautam","101",address1);
		
		Employee clonedEmp = (Employee) emp.clone();
		
		emp.address.city="Hyd"; // shallow copy.
		System.out.println(emp.address.city);
		System.out.println(clonedEmp.address.city);
		
		
		
	}

}
