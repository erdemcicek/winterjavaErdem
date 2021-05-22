package day12dowhilevariablesconstructors;

public class InstanceLocalAndClassVariables {
	/*
	 			==== Instance (Object) Variables ====
	 	--> We create instance inside the class but outside of the methods
	 	--> If you don't initialize, (assigning value) an instance variable, Java will assign them default values.
	 	--> Instance variables are not static
	 	--> To access instance variables you need to create an object
	 	--> You cannot access instance variables by class name
	 		> Default values:
	 		For byte, short, int, long default value is 0
	 		For char default value is ''
	 		For boolean default value is false
	 		For float and double default value is 0.0
	 		For String default value is null
	 		
	 		
	 			==== Instance (Object) Variables ====
	 	--> We create class variables inside the class but outside the methods
	 	--> Class variables are 'static'
	 	--> You can access class variables by using class name
	 	
	 	
	 	Note: The main differences between static (class) variables and instance (object) variables is that 
	 		a) All updates on a static variables is visible by all objects which are created from class but all 
	 		   updates on an instance variables is visible just by only object.
	 		b) static variables are common for all objects but instance variables are specified for an object
	 		
	 		=====Local Variable=====
	 		If you create a variable inside a method it is called "local variable"
	 		We have to initialize local variables
	 		There is no default value for local variables
	 		
	 	Note: Local variables created in static method are static automatically.
	 	
	 */
	
	
	int num1 = 5; // Instance variable
	static int num2; // If I don't type "static" Java complains . Because Java would not have access those values without "static"
	static String str;
	static double d;
	static char c;
	
	static short s; // Class variable

	public static void main(String[] args) {
		System.out.println(InstanceLocalAndClassVariables.str);
//		System.out.println(str); // null
//		System.out.println(c);   // ''
//		System.out.println(num2);// 0
//		System.out.println(d);   // 0.0

	}
	int y = 6; 
	public int add( int a , int b) {
		return a+b;
	}

}
