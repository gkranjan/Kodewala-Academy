package com.wholeInterface.ECommerceOrderManagementSystem;

import java.util.Scanner;

public class EcommerceApp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Order ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Order Amount: ");
        double amount = sc.nextDouble();
        
        if(!IOrder.validateOrder(amount))
        {
        	System.out.println("Invalid Order Amount");
        	sc.close();
        	return;
        }
        
        IOrder order = new OnlineOrder(id,amount);
        order.placeOrder();
        order.showOrderStatus();
        
        OnlineOrder online =(OnlineOrder)order;
        
        double discount = online.calculateDiscount(amount);
        
        double finalAmount = amount - discount;
        
        System.out.println("Original Amount: " + amount);
        System.out.printf("Discount: %.2f %n" , discount);
        System.out.println("Final Amount: " + finalAmount);
        
        online.trackOrder(id);
        
        INotification notification = message ->
        System.out.println("Customer Notification: " +message);
        
        notification.sendNotification("Your order has been confirmed!");
        
        if(online instanceof IPriorityOrder)
        {
        	System.out.println("Priority Order Detected");
        }
        
        System.out.println("Order Comparision Value: " +online.compareTo(new OnlineOrder("ORD999",5000)));
        sc.close();
        
	}

}
