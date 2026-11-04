package com.kodewala.loop5;

public class DriverWhile {

	public static void main(String[] args) {

		// 1000 cities
		
		String[] cities = {
			    "Delhi",
			    "Mumbai",
			    "Bengaluru",
			    "Chennai",
			    "Kolkata",
			    "Hyderabad",
			    "Pune",
			    "Ahmedabad",
			    "Bengaluru",
			    "Lucknow",
			    "Patna",
			    "Bhopal",
			    "Indore",
			    "Bengaluru",
			    "Nagpur",
			    "Kanpur",
			    "Ranchi",
			    "Agra",
			    "Varanasi",
			    "Noida"
			};
		// find if Bangalore is part of the list or not.
	for(int index=0;index < cities.length;index++)
	{
		String currentCity = cities[index];
		if(currentCity.equals("Bengaluru"))
		{
			System.out.println("Bangalore is the part of city list");
			break;  // break the loop ---> you will come out of the loop.
		}
	}
	}

}
