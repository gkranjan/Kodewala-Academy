package com.interview.questions;

public class ValidPalindrome {

	public static boolean isPalindrome(String text)
	{
		int left=0;
		int right = text.length()-1;
		
		while(left < right)
		{
			while(left < right && !Character.isLetterOrDigit(text.charAt(left))) left++;
			while(left < right && !Character.isLetterOrDigit(text.charAt(right))) right--;
			
			
			char a = Character.toLowerCase(text.charAt(left));
			char b= Character.toLowerCase(text.charAt(right));
			if(a !=b) return false;
			left++;
			right--;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal : Panama "));
	}

}
