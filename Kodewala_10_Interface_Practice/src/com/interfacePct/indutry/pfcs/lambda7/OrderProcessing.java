package com.interfacePct.indutry.pfcs.lambda7;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OrderProcessing {

	public static void main(String[] args) {

		// 1. Predicate: Check order eligibility
		Predicate<Double> orderCheck = amount -> amount >= 1000;
		
		// 2. Function: Calculate discount
		Function<Double,Double> discount = amount -> amount *0.10;
		
		// 3. Consumer: Display order message
		Consumer<String> message = msg -> 
		System.out.println(msg);
		
		// 4. Supplier: Generate order ID
		Supplier<String> orderId = ()-> "ORD-1001";
		
		double amount = 5000;
		
		if(orderCheck.test(amount))
		{
			double discountAmount = discount.apply(amount);
			
			double finalAmount = amount - discountAmount;
			
			message.accept("Order Accepted");
			message.accept("Order ID: "+orderId.get());
			message.accept("Original Amount: "+amount);
			message.accept("Discount: "+discountAmount);
			message.accept("Final Amount: "+finalAmount);
		}
		else
		{
			message.accept("Order Not Eligible");
		}
	}

}
