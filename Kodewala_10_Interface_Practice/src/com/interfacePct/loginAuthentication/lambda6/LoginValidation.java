package com.interfacePct.loginAuthentication.lambda6;

@FunctionalInterface
public interface LoginValidation {

	boolean validate(String userName,String password);
}
