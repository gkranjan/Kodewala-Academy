package loopSameClass;


public class PowerLoop {

	public static void main(String[] args) {

		int a=4,b=5,p=1;
		for(int i=1;i<=b;i++)
		{
			p*=a;
			System.out.println(p);
		}
	}
}
