package numberProblemsAndPatterns;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x=n,rev=0;
		
		while(x!=0)
		{
			rev=rev*10+x%10;
			x/=10;
			
		}
		
		System.out.println(n==rev);
		sc.close();
	}

}
