package com.industryBased.dailySalesRevenue;

import java.util.Scanner;

public class DailySalesManagement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		double[] sales =new double[3];
		
		double totalSales=0;
		double higestSales =0;
		int bestDay =0;
		
		System.out.println("======== WEEKLY SALES REPORT =======");
		
		for(int i =0;i<sales.length;i++)
		{
			System.out.println("Enter sales for day "+(i+1)+": ");
			sales[i]=sc.nextDouble();
			
			totalSales += sales[i];
			
			if(i==0 || sales[i] > higestSales)
			{
				higestSales = sales[i];
				bestDay =i+1;
				
			}
		}
		
		double averageSales = totalSales / sales.length;
		
		System.out.println("\n======= SALES SUMMARY ========");
		System.out.println("Total Weekly Sales: "+totalSales);
		System.out.printf("Average Daily Sales: %.2f\n ",averageSales);
		System.out.println("Higest sales: "+higestSales);
		System.out.println("Best Sales Day: "+bestDay);
		
		sc.close();
	}

}
