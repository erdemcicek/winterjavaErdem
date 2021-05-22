package day14constructorsstatickeywordarrays;

public class Animal {
	// constructor must have the same name as class name
//	Animal dog = new Dog(); 		// it complains , Dog has red underline
									// constructors have always upper case initials
							// Constructor names start with upper cases (Because they match with class names)
							//but method names start with lower cases
							// Methods must have "return type", but constructors must not
	
	public String name = "Joe";			// if I type static , then it is a class variable ; but now it's instance variables
	public int weight = 20;
	public boolean herbivorous = true;
	

	public Animal() {
		this("Joe",23);			// construction call must be always done in the first line 
		System.out.println("1st constructor is executed");
	}
	public Animal(String name) {
		System.out.println("2nd constructor is executed");
		this.name = name;
	}
	public Animal(String name, int weight) {
		System.out.println("3rd constructor is executed");
		this.name = name;
		this.weight = weight;
	}
	public Animal(String name, int weight, boolean herbivorous) {
		this("Ash");		// in a constructor you can do just a single construction call. If you do multiple construction call
							// at least one of them will not be in the first line. That contradicts with the first line rule.
		System.out.println("4th constructor is executed");
		this.name = name;
		this.weight = weight;
		this.herbivorous = herbivorous;	
	}
	public static void main(String[] args) {
		
		Animal dog1 = new Animal("Joey",25,false);
		System.out.println(dog1.name);
		
		
	}
	
	
	
	
	
}
	