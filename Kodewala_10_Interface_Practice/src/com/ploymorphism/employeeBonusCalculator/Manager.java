package com.ploymorphism.employeeBonusCalculator;

public class Manager  extends Employee{

	@Override
	public double calculateBonus(double salary,int rating)
	{
		return rating >=3 ? salary * 0.20 : 0;
			
	}
}
