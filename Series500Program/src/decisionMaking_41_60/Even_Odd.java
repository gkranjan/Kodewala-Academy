package decisionMaking_41_60;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		System.out.println(number%2==0 ? "Even" : "Odd");
		sc.close();
	}

}
