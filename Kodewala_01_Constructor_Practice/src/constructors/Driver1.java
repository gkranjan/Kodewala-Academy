package constructors;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);  // this is the main line of want to input.
		
		System.out.print("Enter Name");
		String _name=sc.nextLine();	// if you want to input form user then this line should be inslized.
		
		System.out.print("Product");
		String _product=sc.nextLine();
		
		System.out.print("Product ID");
		int _productID=sc.nextInt();
		
		
		AmazonManProduct obj=new AmazonManProduct(_name,_product,_productID); // also pass all variables in this object.then they will call.
		
		System.out.println(" "+obj.name);
		System.out.println(" "+obj.product);
		System.out.println(" "+obj.productID);
	}

}
