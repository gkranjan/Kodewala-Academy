package constructor;

public class Addition2 {

	int a;
	int b;
	
	Addition2(int _firstNumber,int _secondNumber)
	{
		this.a = _firstNumber;
		this.b = _secondNumber;
		
		
	}
	
	void display()
	{
		
		System.out.println("Sum:= " + (a+b));
	}
	
}
