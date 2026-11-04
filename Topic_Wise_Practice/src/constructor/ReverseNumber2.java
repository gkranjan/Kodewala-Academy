package constructor;

public class ReverseNumber2 {
	
	int number;
	
	ReverseNumber2(int _number)
	{
		this.number=_number;
		
	}
	
		void show()
		{
			int reverse=0;
			while(number != 0)
			{
				int digit = number % 10;
				
				reverse = reverse *10 + digit;
				
				number = number / 10;
				
			}
			
				System.out.println("Reverse = " +reverse);
		}
}
