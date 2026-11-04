package com.revision.mixTopics;

public class FindLargestSmallest {

	public static void main(String[] args) {

		int [] numbers = {14,50,63,5,89};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int n :numbers)
		{
			if (n> largest) largest =n;
			if(n < smallest) smallest =n;
		}
		
		String label="array result";
		System.out.println(label.toUpperCase());
		System.out.println("Largest: " +largest);
		System.out.println("Smallest: " +smallest);
		
	}

}
