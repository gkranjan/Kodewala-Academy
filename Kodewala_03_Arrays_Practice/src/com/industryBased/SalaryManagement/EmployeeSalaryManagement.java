package com.industryBased.SalaryManagement;

import java.util.Scanner;

public class EmployeeSalaryManagement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of employee: ");
		int n=sc.nextInt();
		
		double[] salary =new double[n];
		
		double totalSalary =0;
		double highestSalary = salary[0];
		double lowestSalary = salary[0];
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter salary of employee " +(i+1) +": ");
			salary[i] =sc.nextDouble();
			
			totalSalary += salary[i];
			
			if(i==0)
			{
				highestSalary = salary[i];
				lowestSalary = salary[i]; 
			}
			
			if(salary[i] > highestSalary)
			{
				highestSalary = salary[i];
			}
			if(salary[i] < lowestSalary)
			{
				lowestSalary = salary[i];
			}
		}
		
		double averageSalary = totalSalary / n;
		
		System.out.println("\n======= EMPLOYEE SALARY REPORT ========");
	
		for(int i=0;i<n;i++)
		{
			System.out.println("Employee "+(i+1)+": "+salary[i]);
		}
		
		System.out.println("Total Salary: "+totalSalary);
		System.out.println("Average Salary: "+averageSalary);
		System.out.println("Higest Salary: "+highestSalary);
		System.out.println("Lowest Salary: "+lowestSalary);
		
		sc.close();
	}

}
