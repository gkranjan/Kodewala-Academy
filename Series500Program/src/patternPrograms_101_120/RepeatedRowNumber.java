package patternPrograms_101_120;

import java.util.Scanner;

public class RepeatedRowNumber {

	public static void main(String[] args) {

		//int n = 5;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n=sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
		sc.close();
	}

}
