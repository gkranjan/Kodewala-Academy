package string;

public class CountConsonants {

	public static void main(String[] args) {

		String s="java programming";
		int c=0;
		for(char ch:s.toCharArray())
		{
			if(Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch)>=0)
				c++;
		}
		System.out.println(c);

	}

}
