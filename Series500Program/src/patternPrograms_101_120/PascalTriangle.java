package patternPrograms_101_120;

public class PascalTriangle {

	public static void main(String[] args) {

		int n=5;
		for(int i=0;i<n;i++)
		{
			int v=1;
			for(int s=0;s<n-i;s++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				System.out.print(v+ " ");
				v=v*(i-j) /(j+1);
			}
			System.out.println();
		}
	}

}
