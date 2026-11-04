package numberProblemsAndPatterns;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int x=Math.abs(n);
		 int sum=0;
		 int t=x;
		 
		 while (t >0)
		 {
			 sum += t % 10;
			 t/=10;
		 }
		 
		 System.out.println(sum != 0 && x % sum == 0);
		 sc.close();
	}

}
