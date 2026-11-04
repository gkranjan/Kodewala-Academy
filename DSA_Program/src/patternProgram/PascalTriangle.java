package patternProgram;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			// Print Spaces
			
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			int number =1;
			
			// print numbers
			for (int j=0;j <= i; j++)
			{
				System.out.print(number + " ");
				number = number * (i - j) / (j +1);
			}
			System.out.println();
		}
		sc.close();
	}

}
