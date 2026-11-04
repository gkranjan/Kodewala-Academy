package com.kodewala.inf3;

@FunctionalInterface
public interface IAccount {

	//void openAccount(); // only one abstract method(SAM)

	String  openAccount(String name,String address,int balance);
	
	
}
