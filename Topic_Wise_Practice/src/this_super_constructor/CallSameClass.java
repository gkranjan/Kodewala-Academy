package this_super_constructor;

public class CallSameClass {

	
	int id;
	String name;
	
	CallSameClass()
	{
		this(101,"Gautam");
		System.out.println("Default constructor");
	}
	
	CallSameClass(int id,String name)
	{
		
		this.id=id;
		this.name=name;
		
	}
	
		void display()
		{
			System.out.println(id+" "+name);
		}
}

	
