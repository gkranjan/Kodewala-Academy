package numberProblems_81_100;

public class ArmstrongNumberInRange {

	static boolean arm(int n) {
		int t = n, sum = 0;

		while (t > 0) {
			int d = t % 10;
			sum += d * d * d;
			t /= 10;
		}
		return sum == n;
	}

	public static void main(String[] args) {
		for (int n = 100; n <= 999; n++)
			if (arm(n))
				System.out.println(n + " ");
	}
}
