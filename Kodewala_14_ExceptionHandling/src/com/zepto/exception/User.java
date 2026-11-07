package com.zepto.exception;

public class User {

	public static void main(String[] args) {

		Driver driver=new Driver();
		// pass null in username,then show the exception.
		driver.createUser("Gautam", "@1233*Test");
	}

}
