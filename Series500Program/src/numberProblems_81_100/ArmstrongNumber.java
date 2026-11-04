package numberProblems_81_100;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 153;
		int t = n;
		int sum = 0;

		while (t > 0) {
			int d = t % 10;
			sum += d * d * d;
			t /= 10;
		}
		System.out.println(n == sum);
	}
}
