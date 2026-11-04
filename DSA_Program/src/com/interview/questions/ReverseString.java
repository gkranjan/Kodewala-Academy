package com.interview.questions;

public class ReverseString {

	public static String reverse(String text)
	{
		StringBuilder result =new StringBuilder();
		
		for (int i=text.length()-1;i>=0;i--)
		{
			result.append(text.charAt(i));
		}
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse("Java"));
		
	}

}
