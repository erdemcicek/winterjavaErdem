package day25overridingexceptions;

public class Runner {
	
	public static void main(String[] args) {

		// Create an object whose data type is Animal, Constructor is Dog
		// Note: When you create an object, you may use "parent class" as data type
		// data type is coming from parent class, constructor is coming from the child class
		// Note : If parent and child classes have methods whose names are the same
		//        look at the data type to understand which one will be called
		
		
		// Note: If you use  "parent class" as data type, the class members in child class 
		//		 will be inaccessible.
		
		Animal obj1 = new Dog(); // this is better , because it is more general
		
		//Note: If you use "child class" as data type, the class members in child class
		// 		and in parent class will be accessible.
		
		Dog obj2 = new Dog();// birthYear, tail , name , height -  drink(), bark()
		
		
		
		
		
		
	
		
		
	/*
	 	If you use same method in parent and child classes 
	 	Java executes "overriding method"....
	 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
// create an object whose data type is
// Animal and constructor is also Animal
	
/*
 If parent class and child class have methods whose name are the same,
 look at the data types to understand which one will be called
 if you're trying to access a variable you need to check the data type
 if you're trying to access a mehtod you need to check the constructor
 if you use "parent class" as data type the variables and methods which are
 in child class, will NOT be accessible
 if you use "child class" as data type the variables and methods which are 
 in parent class will be accessible 
 */