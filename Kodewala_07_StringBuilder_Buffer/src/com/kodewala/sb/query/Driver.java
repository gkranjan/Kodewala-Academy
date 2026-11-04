package com.kodewala.sb.query;

public class Driver {

	public static void main(String[] args) {

		QueryGenerator generator = new QueryGenerator();
		StringBuilder result1 = generator.generateQuery(2000, null);

		StringBuilder result2 = generator.generateQuery(0, "kw002");
		StringBuilder result3 = generator.generateQuery(0, null);
		

		System.out.println("result1 : " + result1);
		System.out.println("result1 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
