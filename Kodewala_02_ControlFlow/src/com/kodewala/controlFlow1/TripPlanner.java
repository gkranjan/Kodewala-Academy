package com.kodewala.controlFlow1;

public class TripPlanner {
	
	public String suggestPlan(String src,String dest,int budget)
	{
		String suggestion = null;
		
		if(budget <=1000)
		{
			suggestion="You can be in home only!!";
			System.out.println(suggestion);
		}
		else if (budget > 1000 && budget <=3000)
		{
			suggestion="You can visit with in city like lal bagh etc...You can watch movie";
			System.out.println(suggestion);
		}
		else if(budget >3000 && budget <= 5000)
		{
			suggestion = "You can hire a taxi and visit near by places like mysore etc...";
			System.out.println(suggestion);
		}
		else
		{
			suggestion = "You can visit goal!";
			System.out.println(suggestion);
		}
		
		return suggestion;
	}

}
