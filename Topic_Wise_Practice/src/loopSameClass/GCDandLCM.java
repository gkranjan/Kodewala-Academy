package loopSameClass;

public class GCDandLCM {

	public static void main(String[] args) {

		int a = 12;
		int b = 18;

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		int gcd = a;

		// find LCM

		int lcm = (a * b) / gcd;

		System.out.println("GCD = " + gcd);
		System.out.println("LCM = " + lcm);

	}

}
