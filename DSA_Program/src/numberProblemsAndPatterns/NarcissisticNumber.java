package numberProblemsAndPatterns;

import java.util.Scanner;

/**
 * The sum of each digit raised to the power of the total number of digits equals the original number.
 * 
 * Formula

	If a number has n digits:

	Number = digit₁ⁿ + digit₂ⁿ + ... + digitₙⁿ

	Example: 153

	153 has 3 digits.
 */
public class NarcissisticNumber {  

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int x = Math.abs(n);
		int digits = String.valueOf(x).length();

		long sum = 0, t = x;

		while (t > 0) {
			long d = t % 10;

			sum += (long) Math.pow(d, digits);
			t /= 10;
		}
		// System.out.println(sum == x);

		if (sum == n) {
			System.out.println("Narcissistic Number:");
		} else {
			System.out.println("Not a Narcissistic Number:");
		}
		sc.close();
	}

}
