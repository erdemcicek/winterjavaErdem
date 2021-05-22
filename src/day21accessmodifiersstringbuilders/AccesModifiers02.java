package day21accessmodifiersstringbuilders;

public class AccesModifiers02 {
	/*
	 	To access class members from another class we have two ways:
	 	1) We can use class name => it works only for static members
	 	2) We can create object => it works for non-static members
	 	
	 	I)   In AccessModifiers01 class we created public, protected, default, private variables
	 	     In AccessModifiers02 we created an object to access them but we could not access to private ones.
	 	   
	 	II)  From different packages you cannot access default members
	 		 That's why "default" and "package private" are synonums.
	 	
	 	III) From different packages we have two options to access protected members
	 		 If we are in child class (sub-class) we can access them
	 		 If we are not in a child class we cannot access them
	 	IV)  For public class members we can access them from everywhere
	 	
	 	Note: For classes, "private" and "protected" access modifiers cannot be used
	 */

	public static void main(String[] args) {
		
		AccessModifiers01 obj = new AccessModifiers01();
		System.out.println(obj.defaultString);
		System.out.println(obj.protectedString);
		System.out.println(obj.publicString);
//		System.out.println(obj.privateString);
		
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
		
//		System.out.println(add(3,4));
//		System.out.println(greeting("Edward"));
//		int z = add(3,7) + add(6,8);
//		int h = add2(3,7);
//	}
//	public static String greeting(String name) {
//		
//		return "Hello" + name;
//		
//	}
//	public static int add(int a, int b) {
//		return a+b;
//	}
//	public static void add2(int c, int d) {
//		System.out.println(c+d);
//	}
//	void method(String s) { // for public you can access from anywhere
//							// for default you can acces from just the same package ( package-private) 
//	}
	}
}
