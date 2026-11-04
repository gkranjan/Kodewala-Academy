package com.kodewala.myself.string;

public class WebOrAppResponses {

	public static void main(String[] args) {

		StringBuilder response=new StringBuilder();
		
		response.append("{ \"status\": \"success\",");
		response.append(" \"data\": { \"id\":123, \"name\": \"john\"}}");
		
		System.out.println(response.toString());
		
	}

}
