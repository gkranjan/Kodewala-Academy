package com.revision.mixTopics;

public class CharacterFrequency {

	public static void main(String[] args) {

		String text="banana";
		char target ='a';
		int count=0;
		
		for(char ch : text.toCharArray())
		{
			if(ch== target)
			{
				count++;
			}
		}
		System.out.println("Character " +target+ "appears " +count +" times.");
	}

}
