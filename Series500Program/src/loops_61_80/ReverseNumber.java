package loops_61_80;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		/**
		 * predefine reverse number.
		 */
		
//		int n=12345,rev=0;
//		
//		while(n>0)
//		{
//			rev=rev*10+n%10;
//			n /=10;
//		}
//		
//		System.out.println(rev);
		
		/**
		 * User input reverse number;
		 */
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int rev=0;
		while (n>0)
		{
			rev=rev*10+n%10;
			n /=10;
		}
		System.out.println(rev);
		
		sc.close();
	}

}
