package com.kodewala.oops.inheritance2;

public class Driver {
	String name = "Gautam";
	String address = "Bangalore";
	private String empCode = "IC!123"; // use only in class

	public void markIn(String empId) {
		System.out.println("Marking IN " + empId);
	}
}

class Manager extends Driver // Driver(Manager) IS-A Employee
{
	public void dosomething() {

		System.out.println(name); // using the parent class attributes
		System.out.println(address);
		// System.out.println(empCode); // cannot use outside the class

		markIn(address); // using the parent class method
	}
}

//class Drivername {
//	public static void main(String[] args) {
//		Manager driver = new Manager();
//		driver.dosomething();
//	}
//}
