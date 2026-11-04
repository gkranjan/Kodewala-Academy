package loopSameClass;

import java.util.Scanner;

public class MultiplyTable {

	public static void main(String[] args) {

		/**
		 * 1. type you print.
		 */
		
//		for (int i=1;i<=10;i++)
//		{
//			int b=i*2;
//			System.out.println(b);
//		}
		
		
		/**
		 * 2.Also used to user input.
		 */
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter you number:");
//		int num=sc.nextInt();
		
		/**
		 * 3. command line argument.
		 */
		
		int num= Integer.parseInt(args[0]);
		
		
		/**
		 * 4. devloper input.
		 */
		//int n=7;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
