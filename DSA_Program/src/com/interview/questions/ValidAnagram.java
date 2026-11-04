package com.interview.questions;

public class ValidAnagram {
	
	public static boolean isAnagram(String a,String b)
	{
		if(a.length() !=b.length()) return false;
		int[] count = new int[26];
		
		for(int i=0;i<a.length();i++)
		{
			count[a.charAt(i) - 'a']++;
			count[b.charAt(i) - 'a']--;
		}
		for(int value :count)
		{
			if(value !=0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("listen","silent"));
		
	}

}
