package com.revision.mixTopics;

public class PasswordRuleChecker {
	
	static class PasswordChecker
	{
		String password;
		
		PasswordChecker(String password)
		{
			this.password=password;
		}
		
		boolean isValid()
		{
			return password.length() >= 8 
					&& password.matches(".*[A-Z].*")
					&& password.matches(".*[0-9].*");
		}
	}
	
	public static void main(String[] args) {
		PasswordChecker [] tests = {
				new PasswordChecker("Java1234"),
				new PasswordChecker("Java"),
				new PasswordChecker("HELLO2026")
				
		};
		
		for(PasswordChecker test : tests)
		{
			System.out.println("Valid: " +test.isValid());
		}
	}

}
