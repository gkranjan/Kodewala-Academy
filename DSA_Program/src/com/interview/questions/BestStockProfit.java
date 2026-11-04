package com.interview.questions;

public class BestStockProfit {
	
	public static int maxProfit(int[] prices)
	{
		int minPrice = Integer.MAX_VALUE;
		int bestProfit = 0;
		
		for(int price : prices)
		{
			if (price < minPrice)
			{
				minPrice = price;
			}
			else if (price - minPrice > bestProfit)
			{
				bestProfit = price - minPrice;
			}
		}
		return bestProfit;
	}
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

}
