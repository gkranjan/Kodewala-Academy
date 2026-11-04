package loops_61_80;

public class CountDigits {

	public static void main(String[] args) {

		int n=98765,count=0;
		
		do
		{
			count++;
			n /=10;
		}
		while(n!=0);
		System.out.println(count);
	}

}
