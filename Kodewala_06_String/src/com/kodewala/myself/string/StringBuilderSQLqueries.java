package com.kodewala.myself.string;

public class StringBuilderSQLqueries {

	public static void main(String[] args) {

		StringBuilder query =new StringBuilder("SELECT * FROM employees WHERE 1=1");
		
		boolean filterByDepartment=true;
		
		if(filterByDepartment)
		{
			query.append(" And department = 'IT'");
			
		}
		
		boolean filterBySalary =true;
		
		if(filterBySalary)
		{
			query.append(" And salary > 50000");
		}
		
		System.out.println(query.toString());  //SELECT * FROM employees WHERE 1=1 And department = 'IT' And salary > 50000

	}

}
