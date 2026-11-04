package com.kodewala.oops.ploymorphism1;


class Employee
{
	public void markIn()
	{
		System.out.println("Employee.markIn().....Employee Marking IN");
		
	}
}

class HRManager extends Employee
{
	@Override
	public void markIn()
	{
		System.out.println("HRManager.markIn().....HRManager Marking IN");
		
	} 
}

public class Driver
{
	public static void main(String[] args) {
		
		
		Employee e1 =new Employee();  
		e1.markIn();
		
		Employee e2=new HRManager(); //Parent class can refer child class object.
		e2.markIn(); // same method will behave differently based on the actual object.
		
		// 1. at the time compilation,it will check the method's exist in class employee
		// 2. at the time of execution(while running),it will call the method on actual object.
	}
	}