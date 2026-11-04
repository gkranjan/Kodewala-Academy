package patternProgram;

import java.util.Scanner;

public class HollowSquare {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(i==1 || i==n || j==1 || j==n ? "*":" ");
			System.out.println();
		}
		sc.close();
	}

}
