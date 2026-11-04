package constructor;

public class EvenOdd2 {
	
	int n;
	
	EvenOdd2(int n)
	{
		this.n=n;
	}
	
		void show()
		{
			System.out.println(n%2==0 ? "Even" : "Odd");
		}

}
