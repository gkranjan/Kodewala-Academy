package patternPrograms_101_120;

public class ConcentricNumberSquare {

	public static void main(String[] args) {

		int n=5;
		int size = 2* n-1;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				int m=Math.min(Math.min(i, j), Math.min(size-1-i, size-1-j));
				System.out.print((n-m)+ " ");
			}
			System.out.println();
		}
	}

}
