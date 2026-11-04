package com.kodewala.loop5;

public class ForAndIf {

	public static void main(String[] args) {

		// 100k
		
		int[] numbers = {
			    10, -5, 25, -12, 8,
			    -20, 15, -3, 30, -18,
			    7, -9, 22, -1, 14,
			    -25, 6, -11, 19, -7
	
		};
		
		// multiply +ve number by 10
		
		for(int index=0; index < numbers.length;index++)
		{
			int currentNumber = numbers[index];
			
			if(currentNumber <0)
			{
				continue;  // skip the current iteration.
			}
			
			System.out.println(currentNumber *10);  // biz -->100 lines
		}
	}

}
