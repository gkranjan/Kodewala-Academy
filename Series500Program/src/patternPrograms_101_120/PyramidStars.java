package patternPrograms_101_120;

public class PyramidStars {

	public static void main(String[] args) {

		int n=20;
		
		for(int i=1;i<=n;i++)
		{
			for(int s=i;s<n;s++)
				System.out.print(" ");
			for(int j=1;j<= 2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
