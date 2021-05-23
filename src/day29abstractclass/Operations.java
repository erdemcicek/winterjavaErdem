package day29abstractclass;

/*
 		1) abstract methods cannot be put into concrete classes.
 			abstract methods can be put into abstract classes.
 			
 		** Like we have GeometricObject parent class and we have getArea method;
 		** and we have Circle and Rectangele child classes, their areas are calculated differently
 		** but the method is common
 */

public abstract class Operations {

	public abstract int add(int... a);
	public abstract int subtract(int... a);
	public abstract int division(int a, int b);
	public abstract int multiplication(int... a);
	
	public double sqrt(int a) {
		double result = 0;
		try {
			result = Math.sqrt(a);
		}catch(ArithmeticException e) {
			System.out.println();
		}
		return result;
	}
	
	
	
}
