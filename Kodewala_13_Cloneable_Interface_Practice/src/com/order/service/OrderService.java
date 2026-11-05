package com.order.service;

import com.order.model.Address;
import com.order.model.Order;

public class OrderService {

	public static void main(String[] args) {

		Address address = new Address("Bangalore", "Karnataka");

		Order originalOrder = new Order(1001, "Amit", address);
		//originalOrder.display();
		try {
			Order cloneOrder = (Order) originalOrder.clone();

			// Changing cloned object's address
			cloneOrder.getaddress().setCity("Kolkata");
			System.out.println("Original Order: ");
			originalOrder.display();

			System.out.println("\nCloned Order: ");
			cloneOrder.display();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
