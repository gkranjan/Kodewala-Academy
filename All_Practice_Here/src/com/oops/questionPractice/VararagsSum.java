package com.oops.questionPractice;

public class VararagsSum {

	static int sum (int ...a)
	{
		int s=0;
		for(int x:a)s+=x;
		
		return s;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4));
		
	}

}
