package loops_61_80;

public class LCMUsingLoop {

	public static void main(String[] args) {

		int a=12,b=18,l=Math.max(a, b);
		while(l%a !=0 || l%b !=0)
			l++;
		System.out.println(l);
	}

}
