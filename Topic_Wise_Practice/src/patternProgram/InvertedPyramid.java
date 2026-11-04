package patternProgram;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		for(int i=n;i >=1;i--)
		{
			// Print spaces.
			for(int j=1;j<=n - i;j++)
			{
				System.out.print(" ");
			}
			
				// print stars  //The important formula for stars is: 2 * i -1
			for(int j = 1; j<=2 * i -1; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
