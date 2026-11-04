package constructor;

public class PositiveNegativeZero2 {
	
	int n;
	
	PositiveNegativeZero2(int n)
	{
		
		this.n=n;
		
	}
	
	void show()
	{
		System.out.println(n>0 ? "Positive"  : n<0 ? "Negative" :"Zero");
		
	}
	

}
