package com.abstraction2;

import java.util.Scanner;

abstract class Motorcycle {

    abstract void start();
}

class BikeBreak extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button");
    }
}

class CarBreak extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with an ignition system");
    }
}

class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.print("Choose Vehicle: ");

        int choice = sc.nextInt();

        Vehicle v;

        if (choice == 1) {
            v = new Bike();
            v.start();
        } else if (choice == 2) {
            v = new Car();
            v.start();
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

	
	

