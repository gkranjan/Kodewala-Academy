package string;

public class CharacterFrequency {
	//Character frequency means how many times a particular character appears in a string.

	public static void main(String[] args) {

		String s="banana";
		char key='a';
		int c=0;
		
		for(char ch:s.toCharArray())
		{
			if(ch==key)
				c++;
			
		}
		System.out.println(c);
	}

}
