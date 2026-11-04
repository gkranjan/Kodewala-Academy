package controlFlow;

public class MakeMyTrip {
	
	public String discount(String name,int amount)
	{
	
	String suggestion=null;
	
	if(amount <=5000)
	{
		suggestion="No Discount applied: ";
		System.out.println(suggestion + name+","+amount);
	}
	
	else if (amount >=5000 && amount <=10000)
	{
		suggestion= "Discount applied of 10%: ";
		System.out.println(suggestion+name+","+amount);
	}
	
	else if (amount >=10000)
	{
		suggestion="Discount applied of 15%: ";
		System.out.println(suggestion+name+","+amount);
	}
	else 
	{
		suggestion= "Final discount applied 1250 only: ";
		System.out.println(suggestion+name+","+amount);
	}
	
	return suggestion;
	}

}
