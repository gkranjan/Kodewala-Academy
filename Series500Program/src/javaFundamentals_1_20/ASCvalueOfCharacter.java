package javaFundamentals_1_20;

import java.util.Scanner;

public class ASCvalueOfCharacter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter character:");
		char ch=sc.next().charAt(0);
		
		System.out.println("ASCII = " +(int)ch);
		sc.close();
	}

}
