package constructor;

public class AgeCheck2 {

	int age;
	
	AgeCheck2(int age)
	{
		this.age=age;
	}
	
		void show ()
		{
			System.out.println(age>=18? "Adult" : "Minor" );
		}
}
