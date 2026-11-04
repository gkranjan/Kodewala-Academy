package com.interview.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static int firstUniqueIndex(String text)
	{
		Map<Character,Integer> counts = new LinkedHashMap<>();
		
		for(int i=0;i < text.length();i++)
		{
			char ch = text.charAt(i);
			counts.put(ch, counts.getOrDefault(ch,0)+1);
		}
		for(int i=0;i < text.length();i++)
		{
			if(counts.get(text.charAt(i))==1) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {

		System.out.println(firstUniqueIndex("swiss"));
		
	}

}
