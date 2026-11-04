package decisionMaking_41_60;

public class SimpleCalculatorUsingSwitch {

	public static void main(String[] args) {

		double a=12,b=4;
		char op='*';
		
		switch(op)
		{
		case'+':
			System.out.println(a+b);
		case'-':
			System.out.println(a-b);
		case'*':
		System.out.println(a*b);
		break;
		
		default:
			System.out.println("Other");
		}
	}

}
