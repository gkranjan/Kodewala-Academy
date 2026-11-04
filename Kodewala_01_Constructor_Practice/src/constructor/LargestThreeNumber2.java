package constructor;

public class LargestThreeNumber2 {

	int a,b,c;
	
	LargestThreeNumber2(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
		
		void show()
		{
			
			System.out.println("Largest= " +Math.max(a,Math.max(b, c)));
		}
	
}
