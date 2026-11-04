package com.kodewala.controlFlow1;

public class Driver {
	public static void main(String[] args) {
		
		TripPlanner planner = new TripPlanner();
		String response =planner.suggestPlan("BLR","GOA", 4000);
		//System.out.println(response);
	}
	

}
