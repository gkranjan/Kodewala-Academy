package loopSameClass;

public class FibonacciNumber {

	public static void main(String[] args) {

		int a=5,b=8;
		for(int i=0;i<=10;i++)
		{
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		
	}

}
