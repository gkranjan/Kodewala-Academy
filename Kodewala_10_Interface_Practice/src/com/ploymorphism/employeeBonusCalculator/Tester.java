package com.ploymorphism.employeeBonusCalculator;

public class Tester extends Employee {
	
	@Override
	public double calculateBonus(double salary,int rating)
	{
		return rating >=3 ? salary * 0.10 : 0;
	}

}
