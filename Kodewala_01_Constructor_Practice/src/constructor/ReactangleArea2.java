package constructor;

public class ReactangleArea2 {

	int length;
	int breadth;

	ReactangleArea2(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
		void show ()
		{
			System.out.println("Area= " + length * breadth);
		}

		
		void display()
		{
			System.out.println("Only for check");
		}
		
		void nextDisplay(String name,int age)
		{
			System.out.println("Only for check " +name+" and "+age);
		}
}
