package patternPrograms_101_120;

public class SandglassPattern {

	public static void main(String[] args) {

		int n = 5;
		// upper part
		for (int i = n; i >= 1; i--) {
			// Spaces

			for (int s = i; s < n; s++)
			{
				System.out.print(" ");
			}

			// Stars
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// Lower part
		for (int i = 2; i <= n; i++) {
			// Spaces
			for (int s = i; s < n; s++)
				System.out.print(" ");

			// Stars
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");

			System.out.println();
		}
	}

}
