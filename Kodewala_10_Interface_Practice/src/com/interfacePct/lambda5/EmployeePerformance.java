package com.interfacePct.lambda5;

public class EmployeePerformance {

	public static void main(String[] args) {

		PerformanceEveluator eveluator = (score) ->
		{
			if(score >=90)
			{
				return "Excellent - Eligible for Promotion";
				
			}
			else if(score>=75)
			{
				return "Good - Performance Bonus";
			}
			else if(score >=50)
			{
				return "Average - Needs Improvements";
			}
			else
			{
				return "Poor - Training Required";
			}
			
		};
		System.out.println(eveluator.evaluate(95));
		System.out.println(eveluator.evaluate(80));
		System.out.println(eveluator.evaluate(60));
		System.out.println(eveluator.evaluate(30));
		
	}

}
