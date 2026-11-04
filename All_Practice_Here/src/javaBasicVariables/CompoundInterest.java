package javaBasicVariables;

public class CompoundInterest {

	public static void main(String[] args) {

		int p=10000;
		double r=10;
		int t=2;
		
		double amount= p *Math.pow((1+r/100),t);
		double CI=amount - p;
		
		System.out.println("Amount: " +amount);
		System.out.println("Compound IntrestP: " +CI);
		
	}

}
