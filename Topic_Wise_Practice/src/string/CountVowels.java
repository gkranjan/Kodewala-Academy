package string;

public class CountVowels {

	public static void main(String[] args) {

		String s="education";
		int c=0;
		for(char ch:s.toCharArray())
		{
			if("aeiouAEIOU".indexOf(ch)>=0)
				c++;
		}
		System.out.println(c);

	}

}
