package com.kodewala.sb.query;

public class QueryGenerator
{
public StringBuilder generateQuery(int salary, String empID)
{
	
	StringBuilder query = new StringBuilder("Select * from employee");  // created sb object
	
	if(salary >0)
	{
		query.append("Where salary= " +salary + ";"); //modifying existing object
	}
	else if (empID != null)
	{
		query.append("Where empID= " +empID+ ";");	// modifying existing object
		
	}
	else
	{
		query.append(";");  // modifying existing object
	}
	return query;
}
}
