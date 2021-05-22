package day13constructors;

public class Dog {
	
	public String name;
	public int weight;
	public int height;
	
	// I created a constructor below.
	// The constructor has no parameter
	// The constructor has nothing inside the body
	// That kind of constructors are the same as default constructors
	// If you create a constructor, Java deletes the default one.
	public Dog() {  			// When I deleted "public" , nothing happened . I think it's because class is public
								// and the constructor is inside of it. 
		
	}
	public Dog(String name) {
		this.name = name;
	}
	public Dog(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	public Dog(String name, int weight, int height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Joey");
		Dog dog2 = new Dog("Ash", 12, 55);
		Dog dog3 = new Dog(14, 45);
//		dog1.sound();
//		dog2.sound();
//		
//		String str = "Java"; 		// I created a String Object
		
		System.out.println(dog1.name);
		System.out.println(dog2.name);
		System.out.println(dog3.weight);
		System.out.println(dog2.height);
		System.out.println(dog2.height + dog2.weight);
		System.out.println(dog3.height * dog3.weight);
		System.out.println(dog2.height - dog3.height);
		
		// If you want to access class members(variables and methods) you should create object from the class
		
	}
	public static void sound() {
		System.out.println("Dogs bark...");
	}


}
