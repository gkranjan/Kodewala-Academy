package numberProblemsAndPatterns;

import java.util.Scanner;

public class Math_Pow { //Math.pow is used for second number square of the first number.

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");	
		int base=sc.nextInt();
		
		System.out.println("Enter second number:");
		int  exp=sc.nextInt();
		
		long ans=1;
		
		for(int i=0;i<exp;i++)
			ans *= base;  // formula of the square.
		
		System.out.println(ans);
		sc.close();
	}

}
