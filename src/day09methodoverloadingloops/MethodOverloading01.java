package day09methodoverloadingloops;

public class MethodOverloading01 {
	/*
	 	If you use the same method name with the same parameters , Java complains
	 	*Changing method body doesn't work for overloading
	 	* data types , number of parameters , 
	 	* return types are different , doesn't matter for method overloading ( so CompileTimeError )
	 	* access modifiers are different , doesn't matter for method overloading ( so CompileTimeError )
	 */

	public static void main(String[] args) {
		// it complains because methods created don't have 'static' 
		add(3,5);  		// int and int 8
		add(1.2, 2.3);  // double and double 3.5
		add(1.2, 7);    // double and int 8.2
		add('a','b');   // char and char 195
//		add('a',4);     // I'm curious about what will happen ??? -->  it printed " int and int 101 " 
	/*
	 	Method name and method parameters are called " Method Signature " 
	 	In Method Overloading, Method signature must be different
	 */

	}
	public static void add(int a, int b) {
		System.out.println("int and int " + ( a + b));
	}
	public static void add(double a, double b) {			// When I made the first method comment, first call did not
		System.out.println("double and double " + ( a + b));// complain. Java did Auto-Widening. So, third method worked
	}														// and I saw " double and int 8.0 " on the console 
	public static void add(double a, int b) {				// Second method could have been used instead of third one.
		System.out.println("double and int " + ( a + b));	// But Java is lazy : double-int is more memory-saving compared to
	}														// double-double
//	public static void add(char a, char b) {
//		System.out.println("char and char " + ( a + b));
//	}
}
