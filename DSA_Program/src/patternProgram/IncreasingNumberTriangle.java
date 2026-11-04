package patternProgram;

import java.util.Scanner;


/**
 * Print Increasing Number Triangle in Java
 */
public class IncreasingNumberTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {  //The outer loop controls rows:
			
			for (int j = 1; j <= i; j++) {	// The inner loop prints numbers from 1 to i
				System.out.print(j);
			}
			System.out.println();
			sc.close();
		}
	}

}
