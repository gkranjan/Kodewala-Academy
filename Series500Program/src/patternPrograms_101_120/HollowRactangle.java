package patternPrograms_101_120;

public class HollowRactangle {

	public static void main(String[] args) {

		int n=5;
		int r=4,c=7;
		
		for(int i=1;i<=c;i++)
		{
			for(int j=1;j<=c;j++)  // convert j<= c then print A	and put the place of c in n  then 
				// print F
				System.out.print(i==1 || i==r || j==1 || j==c? "* " : "  ");
			System.out.println();
		}
	}
}
