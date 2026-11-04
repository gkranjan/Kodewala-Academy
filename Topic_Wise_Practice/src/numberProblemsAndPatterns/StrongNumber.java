package numberProblemsAndPatterns;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int x=n;
		int sum =0;
		
		while (x>0)
		{
			int d=x % 10, f=1;
			for(int i=2;i<=d;i++)
				f*=i;
			sum +=f;
			x /=10;
		}
		
		System.out.println(sum==n);
		sc.close();
	}

}
