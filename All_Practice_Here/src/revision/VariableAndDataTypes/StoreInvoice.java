package revision.VariableAndDataTypes;

import java.util.Scanner;

public class StoreInvoice {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter item name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter quantity:");
		int quantity=sc.nextInt();
		
		System.out.print("Unit Price:");
		double price=sc.nextDouble();
		
		double totalPrice= quantity * price;
		
		System.out.printf("%-15s : %s%n", "Item Name ",name);
		System.out.printf("%-15s : %.2f%n", "Total Price",totalPrice);
		sc.close();		
		
	}

}
