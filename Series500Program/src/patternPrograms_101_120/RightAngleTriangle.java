package patternPrograms_101_120;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {

		// int n=5; // predefine number.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: "); // user input then print the pattern.
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
		sc.close();
	}

}
