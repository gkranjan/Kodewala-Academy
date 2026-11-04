package constructor;

public class LeapYear2 {
	
	int year;
	LeapYear2(int _year)
	{
		this.year=_year;
	}
	
	void show()
	{
		System.out.println(year%400==0 || (year%4==0 && year%100!=0) ? "Leap year":"Not Leap year");
		
	}

}
