package day24inheritanceoverriding;

public class Vehicle {
	// Overriden Method ==> parent method
	// Overriding Method ==> child method
	public void move() {
		System.out.println("Vehicles move...");
	}
	// private methods cannot be overriden
	
	public void engine() {
		System.out.println("Vehiclles have engine...");
	}
	// engine method needs to overriding
	// this method should be specific
	// the same goes for move method
	
	public int spend() {
		return 11;
	}
	
	public Object speak() {
		return "Hello World";
	}

	public String greet() {
		return "Hello";
	}
	
	
	
	
	
	
	
	
	
	
}
