package loops_61_80;

public class PowerUsingLoop {

	public static void main(String[] args) {

		int base=3,exp=4,result=1;
		
		for(int i=0;i<exp;i++)
			result *=base;
		System.out.println(result);
	}

}
