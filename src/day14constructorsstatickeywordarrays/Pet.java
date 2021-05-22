package day14constructorsstatickeywordarrays;

public class Pet {

	public static void main(String[] args) {
		Dog.eat(); // to access static methods just class name is enough
		Dog dog1 = new Dog();
		dog1.drink();// to access non-static methods, you must create object 
//		dog1.eat();// to access static methods just class name is enough
					// to access static methods, you can use objects as well but it's not recommended, because it is long way
					// and Java gives you notification with yellow underline
	}

}
