package day29abstractclass;

/*
 		1) When you make a "concrete class" child of an abstract class
 			you have to immplement "abstract methods", otherwise you will
 			get compile time error
 		
 		2) After overriding abstract methods, you have to type implementation
 		
 		3) Conctrete child class must override all un-overriden abstract methods
 			from all parent classes
 		
 */

public class ElementarySchoolCalculator extends BlindCalculator {

	@Override
	public int add(int... a) {
		
		int sum = 0;
		for(int w : a) {
			sum += w;
		}
		return sum;
	}

	@Override
	public int subtract(int... a) {
		
		int diff = 0;
		for ( int w : a) {
			diff -= w;
		}
		return diff;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

	@Override
	public int multiplication(int... a) {
		
		int prod = 1;
		for ( int w : a) {
			prod *= w;
		}
		return prod;
	}

	@Override
	public void read() {
		System.out.println("I'm reading for you");
		
	}

}
