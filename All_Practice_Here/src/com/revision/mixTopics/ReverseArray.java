package com.revision.mixTopics;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] values = {4,6,89,12,78,10};
		
		for(int i=0; i< values.length/2;i++)
		{
			int temp=values[i];
			
			values[i] = values[values.length-1-i];
			values[values.length-1-i] =temp;
		}
		
		String title = "reversed array";
		System.out.println(title.toUpperCase());
		System.out.println(Arrays.toString(values));
	}

}
