package javaFundamentals_1_20;

import java.util.Scanner;

public class CharacterFromASC {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter int:");
		int code=sc.nextInt();
		
		System.out.println("Character = " +(char)code);
		sc.close();
	}

}
