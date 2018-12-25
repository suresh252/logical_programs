package com.logical;

public class Vehicle {

	public void printSound() {
		System.out.print("vehicle");
	}
	public static void main(String[] args) {
		
		 Vehicle v = new Car();
	       // Bike b = (Bike) v; ========> runtime exeception that is ClasscastException
	        
	        v.printSound();
	       // b.printSound();
	}
}

class Car extends Vehicle {
	public void printSound() {
		System.out.print("car");
	}
}

class Bike extends Vehicle {
	public void printSound() {
		System.out.print("bike");
	}

}
