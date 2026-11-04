package miniProjectEcommerce2Part;

import java.util.Scanner;

import miniProjectEcommerce.MyntraUser;

public class MyntraCategories extends MyntraUser {

	public void purchase() {
		System.out.println("Enter 2 package of categorise");

		Scanner sc = new Scanner(System.in);

		System.out.println("Which categorise you want to purchase Man/Woman!!!");
		String ch = sc.nextLine().toLowerCase();

		switch (ch) {

		case "man":

			MyntraManProduct prod = new MyntraManProduct();
			prod.myntraManProductInput();
			break;

		case "woman":

			MyntraWomanProduct mwp = new MyntraWomanProduct();
			mwp.myntraWomanProductInput();
			break;

		default:
			System.out.println("!!!Invalid input!!!");
			break;

		}
		sc.close();

		
	}
}
