package com.practice.builder.SQLquery;

import java.util.Scanner;

public class SQLQueryBuilder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter department: ");
		String department = sc.nextLine();
		
		StringBuilder query = new StringBuilder();
		
		query.append("SELECT employee_id,employee_name,salary ");
		query.append("From employees ");
		query.append("WHERE department = ?");
		
		System.out.println("\nGenerated SQL Query:");
		System.out.println(query);
		
		System.out.println("Parameter Value: "+department);
		sc.close();
	}

}
