package numberProblemsAndPatterns;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int sum=0;
		
		while (x != 0)
		{
			int d=x%10;
			
			sum+= d*d*d;
			x/=10;
			
		}
			System.out.println(sum==n);
			sc.close();
	}

}
