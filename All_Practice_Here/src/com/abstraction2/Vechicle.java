package com.abstraction2;

import java.util.Scanner;

	abstract class Vehicle {
		
		abstract void start();
	}

	class Bike extends Vehicle {
@Override
		void start() {
			System.out.println("Bike start with a self-start button");
		}
	}

	class Car extends Vehicle {
		@Override
		void start() {
			System.out.println("Car starts with an ignition system");
		}
	}


 