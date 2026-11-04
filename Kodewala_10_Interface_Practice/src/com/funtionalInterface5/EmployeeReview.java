package com.funtionalInterface5;

public class EmployeeReview {
	
	public static void main(String[] args) {
		Performance p= rating -> {
			
			if(rating >=4)
			{
				return "Excellent Performance";
			}
			else if (rating >= 3)
			{
				return "Good Performance";
			}
			else
			{
				return "Needs Improvement";
			}
		};
		
		System.out.println(p.evaluate(5));
		System.out.println(p.evaluate(3));
		System.out.println(p.evaluate(2));
	}

}
