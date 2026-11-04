package com.ploymorphism.rideFareCalculatorWithDistanceAndWaiting;

/**
 * 
 * Problem: A cab-booking application calculates the fare based on vehicle type, distance, and waiting time.
 * 
 * Formula: Total Fare = (Distance × Rate per km) + (Waiting Minutes × Waiting Rate)
 */
class Ride {
    public double calculateFare(double distance, int waitingMinutes) {
        return 0;
    }
}

class Bike extends Ride {
    @Override
    public double calculateFare(double distance, int waitingMinutes) {
        return (distance * 8) + (waitingMinutes * 1);
    }
}

class Sedan extends Ride {
    @Override
    public double calculateFare(double distance, int waitingMinutes) {
        return (distance * 15) + (waitingMinutes * 2);
    }
}

class SUV extends Ride {
    @Override
    public double calculateFare(double distance, int waitingMinutes) {
        return (distance * 22) + (waitingMinutes * 3);
    }
}

public class Driver {
    public static void main(String[] args) {
        double distance = 10;
        int waitingMinutes = 5;

        Ride ride = new Bike();
        System.out.println("Bike Fare: Rs. "
                + ride.calculateFare(distance, waitingMinutes));

        ride = new Sedan();
        System.out.println("Sedan Fare: Rs. "
                + ride.calculateFare(distance, waitingMinutes));

        ride = new SUV();
        System.out.println("SUV Fare: Rs. "
                + ride.calculateFare(distance, waitingMinutes));
    }
}

