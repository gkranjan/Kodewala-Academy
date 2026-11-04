package com.oops.polymorphishm.revision;

class Delivery {

	public void doDelivery() {

		System.out.println("Delivery.doDelivery()......Delivery");

	}
}

class ExpressGo extends Delivery {
	@Override
	public void doDelivery() {

		System.out.println("ExpressGo.doDelivery()......ExpressGo");

	}

}

class Ekart extends Delivery {
	@Override
	public void doDelivery() {

		System.out.println("Ekart.doDelivery()......Ekart");

	}
}

public class Driver {

	public static void main(String[] args) {

		Delivery delivery = new Delivery();

		delivery.doDelivery();

		Delivery delivery1 = new ExpressGo();

		ExpressGo expressGo = (ExpressGo) delivery1;
		expressGo.doDelivery();

		// ExpressGo ekart=(ExpressGO)new Delivery();

	}

}
