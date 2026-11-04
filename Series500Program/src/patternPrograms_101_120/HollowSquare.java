package patternPrograms_101_120;

public class HollowSquare {

	public static void main(String[] args) {

		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(i==1 || i==n || j==1 || j==n ?" * " : " ");
			System.out.println();
		}
	}

}
