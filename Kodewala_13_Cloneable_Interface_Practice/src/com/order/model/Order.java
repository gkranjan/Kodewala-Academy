package com.order.model;

public class Order implements Cloneable {

	private int orderId;
	private String customerName;
	private Address address;

	public Order(int orderId, String customerName, Address address) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Address getaddress() throws CloneNotSupportedException {
		Order cloneOrder = (Order) super.clone();
		cloneOrder.address = (Address) address.clone();

		return address;
	}

	public void display() {
		System.out.println("Order Id: " + orderId);
		System.out.println("Customer Name: " + customerName);
		address.display();
	}

}
