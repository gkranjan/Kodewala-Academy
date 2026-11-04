package com.interfacePct.supplier.lambda7;

// UUID ka full form: Universally Unique Identifier.
import java.util.UUID; 
import java.util.function.Supplier;

public class OrderIdGenerator {

	public static void main(String[] args) {

		/**
		 * Supplier ka simple meaning:

			Supplier kisi value ko provide karta hai, bina koi input accept kiye.
		 */
		// Iska matlab Supplier String value return karega.,Input=nothing,Output=String.
		
		Supplier<String> orderId = ()->
		{
			// "ORD" :- Ye Order ID ka prefix hai.
			// UUID.randomUUID():- Ye automatically random UUID generate karta hai.
			
			return "ORD-" +UUID.randomUUID();
		};
		// Supplier ka abstract method get() hai.

		System.out.println("Order ID: " +orderId.get());
		System.out.println("Order ID: " +orderId.get());
	}

}
