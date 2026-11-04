package numberProblemsAndPatterns;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		String s=sc.next();
		
			System.out.println(Integer.parseInt(s,2));
			sc.close();
		
				
	}

}
