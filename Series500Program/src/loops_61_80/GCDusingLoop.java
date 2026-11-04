package loops_61_80;

public class GCDusingLoop {

	public static void main(String[] args) {

		int a=48,b=18,g=1;
		
		for(int i=1;i<=Math.min(a, b);i++)
		{
			if(a%i==0 && b%i==0)
				g=i;
			System.out.println(g);
		}
	}

}
