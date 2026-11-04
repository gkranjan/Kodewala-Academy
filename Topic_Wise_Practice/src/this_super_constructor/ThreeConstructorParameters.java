package this_super_constructor;

public class ThreeConstructorParameters {
	
	int id;
	String name;
	double price;
	
	ThreeConstructorParameters(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}

		void display()
		{
			System.out.println("ID: " +id);
			System.out.println("Name: " +name);
			System.out.println("Price: " +price);
		}
}
