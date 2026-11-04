package com.revision.mixTopics;

import java.util.Arrays;

public class SortNames {

	public static void main(String[] args) {

		String[] names = {"Ravi","Aman","Neha","Bina"};
		Arrays.sort(names);
		
		String heading = "sorted names";
		System.out.println(heading.toUpperCase());
		
		for(String name : names)
		{
			System.out.println(name.toUpperCase());
		}
	}

}
