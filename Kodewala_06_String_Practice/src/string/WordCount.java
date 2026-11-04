package string;

public class WordCount {

	public static void main(String[] args) {

		String s="Java is easy to learn";
		String[] w=s.trim().split("\\s+");
		System.out.println(w.length);
	}

}
