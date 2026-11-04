package com.wholeInterface.ECommerceOrderManagementSystem;

// Notice: Discountable extends IOrder

public interface Discountable extends IOrder{
	
	double calculateDiscount(double amount);

}
