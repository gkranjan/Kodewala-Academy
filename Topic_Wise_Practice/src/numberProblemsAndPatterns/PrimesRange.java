package numberProblemsAndPatterns;

import java.util.Scanner;

public class PrimesRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int x=2;x<=n;x++)
		{
			boolean p=true;
			
			for(int d=2;d*d<=x;d++)
				if(x%d==0)
				{
					p=false;
					break;
				}
			
					if(p)
						System.out.println(x+" ");
		}
		sc.close();
		
		
	}

}
