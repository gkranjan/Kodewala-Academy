package com.wholeInterface.ECommerceOrderManagementSystem;


public class OnlineOrder implements Discountable,ITrackable,IPriorityOrder,
Comparable<OnlineOrder>
{

	private String orderId;
	private double amount;
	
	public OnlineOrder(String orderId, double amount) {
		super();
		this.orderId = orderId;
		this.amount = amount;
	}

	@Override
	public void placeOrder() {
		System.out.println("Order Placed Successfully");
        System.out.println("Order ID: " + orderId);
	}

	@Override
	public int compareTo(OnlineOrder other) {
		return Double.compare(this.amount, other.amount);
	}

	@Override
	public void trackOrder(String orderId) {
		System.out.println("Tracking Order: " + orderId);
        System.out.println("Your Order is Out for Delivery");		
	}

	@Override
	public double calculateDiscount(double amount) {

		
		return amount *0.10;
	}
	public double getAmount()
	{
		return amount;
	}
	public String getOrderId()
	{
		return orderId;
	}

}
