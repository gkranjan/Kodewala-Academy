package com.interfacePct.lambda6;


public class OrderDiscount {

	public static void main(String[] args) {
		
		DiscountCalculator regularCustomer = (amount) ->
		{
			return amount *0.05;
		};
		DiscountCalculator premiumCustomer = (amount)->
		{
			return amount *0.15;
		};
		DiscountCalculator vipCustomer = (amount) ->
		{
			return amount *0.25;
		};
		
		double amount = 10000;
		System.out.println("Regular Discount: " +regularCustomer.calculateDiscount(amount));
		
		System.out.println("Premium Discount: "+premiumCustomer.calculateDiscount(amount));
		
		System.out.println("VIP Discount: " +vipCustomer.calculateDiscount(amount));
	}
}
