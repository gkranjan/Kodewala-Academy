package string;

public class RemoveSpaces {

	public static void main(String[] args) {

		String s = "java is fun";
		String r = " ";
		for (char ch : s.toCharArray()) {
			if (ch != ' ')
				r += ch;

		}
		System.out.println(r);
	}

}
