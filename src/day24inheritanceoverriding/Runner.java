package day24inheritanceoverriding;

public class Runner {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog(true);
		
		System.out.println(dog1.height + " " + dog1.weight);
		
		Audi audi1 = new Audi();
		
		audi1.move();
	}

}
