package decisionMaking_41_60;

public class ElectricityBillGenerate {

	public static void main(String[] args) {

		int units=230;
		double bill;
		
		if(units<=100) 
		
			bill=units*1.5;
			//System.out.println(bill);  // this statement can not used here.
			
			else if (units <=200)
			{
				bill=150 +(units-100)*2.5;
		//System.out.println(bill);
			}	
			
			else
			{
				bill=400+(units-200)*4;
			}	
		
			System.out.println("Bill=" +bill);
		
		
	}

}
