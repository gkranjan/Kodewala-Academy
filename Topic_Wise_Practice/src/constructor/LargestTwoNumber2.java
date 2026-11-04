package constructor;

public class LargestTwoNumber2 {
	
	int a,b;
	
	LargestTwoNumber2(int firstNumber,int secondNumber)
	{
		this.a=firstNumber;
		this.b=secondNumber;

	}
	
		void show()
		{
			System.out.println("Largest Number:= "+Math.max(a, b));
		}

}
