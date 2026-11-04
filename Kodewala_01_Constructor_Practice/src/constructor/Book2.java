package constructor;

public class Book2 {
	
	String title;
	double price;
	
	Book2(String title,double price)
	{
		this.title=title;
		this.price=price;
		
	}
	
		void show ()
		{
			System.out.println(title+" -Rs." +price);
			
		}

}
