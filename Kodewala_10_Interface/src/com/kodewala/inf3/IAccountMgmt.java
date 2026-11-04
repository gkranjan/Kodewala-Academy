package com.kodewala.inf3;

//@FunctionalInterface
public interface IAccountMgmt  extends IAccount{
	
	void addDeposit();  // its not a functional interface because one abstract method here and another one in parent interface.
						// if you want to use as a functional then doesn't use anotation then also be the normal interface.

}
