package day14constructorsstatickeywordarrays;

public class Dog {

	public static void main(String[] args) {
		

	}
	public static void eat() { // if something is static it means it is attached to the class
		System.out.println("This is static eat method...");// to access static methods no need to create objects
	}
	public void drink() { // non-static things are attached to the object
		System.out.println("This is not static drink method...");// to access a non-static method you need to object
	}

}
