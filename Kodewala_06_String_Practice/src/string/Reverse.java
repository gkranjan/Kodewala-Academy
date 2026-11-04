package string;

public class Reverse {

	public static void main(String[] args) {

		String s="Hello" ;
		String r=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r+=s.charAt(i);
			System.out.println(r);
		}
	}

}
