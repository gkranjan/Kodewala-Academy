package patternProgram;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		
		
		// Upper half star print.
		
		
		for(int i = 1;i <= n; i++)
		{
			// Spaces
			for(int j=1; j<=n-i ;j++)		// n-1 is use for Spaces.
			{
				System.out.print(" ");
			}
			
				// Stars
			for(int j=1;j <= 2*i-1 ;j++)  // 2*i-1 is use for Star.
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
			// Lower half start print.
		
		// The second loop starts from n - 1 so that the middle row is not printed twice.
		for(int i= n-1 ;i>=1;i--)
		{
			// Spaces
			for(int j=1; j <= n-i ;j++)
			{
				
				System.out.print(" ");
			}
			
				//Stars
			for(int j=1;j<=2 * i - 1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
