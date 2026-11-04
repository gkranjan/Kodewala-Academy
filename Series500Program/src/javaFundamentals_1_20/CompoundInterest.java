package javaFundamentals_1_20;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 number just enter and put : ");
		double p=sc.nextDouble(),r=sc.nextDouble(),t=sc.nextDouble();
		double a=p*Math.pow(1+r/100, t);
		System.out.println("CI = " +(a-p));
		
	}

}
