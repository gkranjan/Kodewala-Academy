package patternProgram;

import java.util.Scanner;

public class PrintSquareNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: "); // input number
		int n = sc.nextInt();		// store input number

		for (int i = 1; i <= n; i++) {		// first loop
			for (int j = 1; j <= n; j++)	// second loop compare to first.
				System.out.print(i + " ");
			System.out.println();
		}

		sc.close();
	}

}
