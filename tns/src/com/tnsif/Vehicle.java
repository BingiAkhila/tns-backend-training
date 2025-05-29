package com.tnsif;

public class Vehicle {
	// Parent class
	    void displayType() {
	        System.out.println("This is a vehicle.");
	    }
}
	// First subclass
	class Car extends Vehicle {
	    void carDetails() {
	        System.out.println("Car has 4 wheels.");
	    }
	}

	// Second subclass
	class Bike extends Vehicle {
	    void bikeDetails() {
	        System.out.println("Bike has 2 wheels.");
	    }
	}

	// Third subclass
	class Truck extends Vehicle {
	    void truckDetails() {
	        System.out.println("Truck is used for transporting goods.");
	    }
	}

	// Main class
class Main {
	    public static void main(String[] args) {
	        Car car = new Car();
	        car.displayType();
	        car.carDetails();

	        Bike bike = new Bike();
	        bike.displayType();
	        bike.bikeDetails();

	        Truck truck = new Truck();
	        truck.displayType();
	        truck.truckDetails();
	    }
	}

