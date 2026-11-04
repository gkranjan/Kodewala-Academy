package string;

public class CountSpaces {

	public static void main(String[] args) {

		String s="Java is easy";
		int c=0;
		
		for(char ch:s.toCharArray())
		{
			if(ch ==' ')
				c++;
		}
		System.out.print(c);

	}

}
