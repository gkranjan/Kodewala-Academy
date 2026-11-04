package decisionMaking_41_60;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter year:");
		int y=sc.nextInt();
		
		//int y=2026;
		
		boolean leap=(y%400==0) || (y%4==0 && y%100!=0);
		
		if(leap==true)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
		System.out.println(leap);
	
	sc.close();
	}

}
