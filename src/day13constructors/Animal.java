package day13constructors;

public class Animal {
	
	public String name = "Joe";			// if I type static , then it is a class variable ; but now it's instance variables
	public int weight = 20;
	public static boolean isHerbivorous = true;

	public static void main(String[] args) {
		Animal dog = new Animal();		// constructor must have the same name as class name
//		Animal dog = new Dog(); 		// it complains , Dog has red underline
										// constructors have always upper case initials
								// Constructor names start with upper cases (Because they match with class names)
								//but method names start with lower cases
								// Methods must have "return type", but constructors must not
		System.out.println(dog.name);
		System.out.println(dog.weight);
//		System.out.println(dog.isHerbivorous);
//		dog.move();
//		dog.eat();
//		dog.drink();
	}
	public static void eat() {
		if ( isHerbivorous)
			System.out.println("Eats plants");
		else
			System.out.println("Eats both plants and meat");
	}
	public static void drink() {
		System.out.println("Drink water");
	}
	public static void move() {
		System.out.println("Moves");
	}

}
