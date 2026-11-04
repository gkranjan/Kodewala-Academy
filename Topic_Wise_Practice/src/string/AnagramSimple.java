package string;

public class AnagramSimple {

	public static void main(String[] args) {

		
		//An anagram is a word or string formed by rearranging all the characters of another word/string, using each character the same number of times.
		
		String a="listen",b="silent";
		char[] x=a.toCharArray(),y=b.toCharArray();
		java.util.Arrays.sort(x);
		java.util.Arrays.sort(y);
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
