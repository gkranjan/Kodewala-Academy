package com.interview.questions;

import java.util.Arrays;

public class MoveAllZerosToEnd {
	
	public static void moveZeros(int[] arr)
	{
		int write =0;
		for(int read=0;read < arr.length;read++)
		{
			if(arr[read] !=0)
			{
				arr[write] = arr[read];
				write++;
			}
		}
		while( write< arr.length)
		{
			arr[write]=0;
			write++;
		}
	}

	public static void main(String[] args) {
		int[] arr= {0,5,0,3,8,0};
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
}
