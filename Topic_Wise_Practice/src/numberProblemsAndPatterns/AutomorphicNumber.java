package numberProblemsAndPatterns;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		long sq=(long) n*n;
			long p=1;
			
			int x=Math.abs(n);
			
			do
			{
				p *=10;
				x /=10;
			}
			
				while (x >0);
			
			System.out.println( sq % p== Math.abs(n));
			sc.close();
	}

}
