package com.revision.mixTopics;

public class Interface {

	interface Payment {
		boolean Pay(double amount);
	}

	static class CarPayment implements Payment {
		public boolean Pay(double amount) {
			return amount > 0;
		}
	}

	static class CashPayment implements Payment {
		public boolean Pay(double amount) {
			return amount >= 0;
		}
	}

	public static void main(String[] args) {
		Payment[] methods = { new CashPayment(), new CashPayment() };
		double[] amounts = { 499, -10 };

		for (int i = 0; i < methods.length; i++) {
			String status = methods[i].Pay(amounts[i]) ? "Success" : "rejected";
			System.out.println(status.toUpperCase());
		}
	}

}
