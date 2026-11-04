package com.revision.mixTopics;

public class StringPalindrome {

	public static void main(String[] args) {

		String word = "madam";
		String normalized=word.toLowerCase();
		
		String reversed = new StringBuilder(normalized).reverse().toString();
		
		if(normalized.equals(reversed))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
