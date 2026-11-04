package this_super_constructor;

public class ConstructorChaining {
	
	String brand;
	int price;
	
	ConstructorChaining()
	{
		this("BMW",500000);
	}
	
	ConstructorChaining(String brand,int price)
	{
		
		this.brand=brand;
		this.price=price;
	}
	
		void show()
		{
			System.out.println(brand);
			System.out.println(price);
		}
}
