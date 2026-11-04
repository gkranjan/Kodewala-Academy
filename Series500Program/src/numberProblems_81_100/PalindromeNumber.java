package numberProblems_81_100;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=12321,t=n,r=0;
		while (t>0)
		{
			r=r*10+t%10;
			t /=10;
			
		}
		System.out.println(n==r);
	}

}

// these are palindrome number,it means reverse the word and number also be the same.
// madam
// 12321
// racecar
// level
// 121
// 1331
