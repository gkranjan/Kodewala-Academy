package patternProgram;

import java.util.Scanner;

public class PrintContinuousNumberTriangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:"); // give input of 5
		int n=sc.nextInt();
		
		System.out.println("Enter 2 number:"); // give input of 1
		int num=sc.nextInt();		// We use a separate variable:
		
		// then print of same as i like it.
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+ " ");
				num++;		// Every time a number is printed.
			}
			System.out.println();
			sc.close();
		}
	}

}
