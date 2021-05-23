package day31interfacecollections;

public class Operations implements I03 {

	public static void main(String[] args) {
		
		// add() method is default method in I03; 
		// because of that I cannot access to add() method
		// by using interface name
		
		// But multiply() method is static method we can
		// access to it just by using interface name
		
		I03.multiply(10, 20);
		
		
		// add() method is a default method, therefore I have to create an object
		
		
		Operations obj = new Operations();
		obj.add(23, 13);
		
		// Note: When we use classes, accessing static methods is allowed by using 
		// 		objects, but interfaces when you create static methods you can access them 
		// 		just by using interface name.
		// 		Accessing by just using objects is not allowed.
		
	}
}
