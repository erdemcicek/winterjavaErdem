package day23encapsulationinheritance;

public class Runner {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.bark(); 
		dog1.drink();     // dog1 inherited drink method from Animal Class
		dog1.eat();  	  // dog1 inherited eat method from Animal Class
		dog1.giveBrith(); // dog1 inherited giveBirth method from Mammal Class
		// all classes have parent class 			     ==> False
		// except Object class all classes have parent   ==> True
		// HAS-A ==> from top to bottom
		// IS-A  ==> from bottom to top
		
		
		
	}

}
