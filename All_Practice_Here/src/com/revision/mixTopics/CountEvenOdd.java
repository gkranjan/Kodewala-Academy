package com.revision.mixTopics;

public class CountEvenOdd {

	public static void main(String[] args) {

		int [] values = {2,7,10,13,18,21,8};
		int even = 0,odd =0;
		
		for(int value :values)
		{
			if(value % 2 ==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
		}
		String result = "count complete";
		System.out.println(result.toUpperCase());
		System.out.println("Even: " +even+", Odd: " +odd);
	}

}
