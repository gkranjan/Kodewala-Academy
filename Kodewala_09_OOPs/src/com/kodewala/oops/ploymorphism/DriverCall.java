package com.kodewala.oops.ploymorphism;

class DriverCall {

	public void accountUser() {
		System.out.println("User.adminUser()");
	}

}

class User extends DriverCall {
	@Override
	public void accountUser() {
		System.out.println("User.adminUser()");
	}
}

class AdminUser extends DriverCall {
	@Override
	public void accountUser() {
		System.out.println("AdminUser.AdminUser()");
	}
}

class HRManager extends DriverCall {
	@Override
	public void accountUser() {
		System.out.println("HRManager.AdminUser()");
	}

}

class MainClass {

	public static void main(String[] args) {

		User u1 = new User(); // User class is referring user class object.

		// User au = new AdminUser();

		// DriverCall au2=(DriverCall) new HRManager(); // Parent class can refer child
		// class object--> auto up-casting

		Object au3 = new DriverCall();
		AdminUser au1 = (AdminUser) new DriverCall(); // child class is referring parent class object--> down casting
	}

}
