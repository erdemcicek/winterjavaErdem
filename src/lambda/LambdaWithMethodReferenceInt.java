package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithMethodReferenceInt {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(9);
		l.add(13);
		l.add(4);
		l.add(9);
		l.add(2);
		l.add(4);
		l.add(12);
		l.add(7);
		
//		printEvensFunctional(l);
//		printOddsFunctional(l);
		
		System.out.println(sumOfSquaresOfEvens(l));
		System.out.println(productOfCubesOfOdds(l));
	}
	
	/*
	 	1) Functional Programming
	 	Create a method to print the even list elements on the console in 
	 	the same line with a space between
	 	two consecutive elements.
	 */
	
	public static void printEvensFunctional(List<Integer> l) {
		
		l.stream().filter(Utils::checkToBeEven).forEach(System.out::println);
	}
	

	/*
	 	2) Functional Prog
	 	Create a method to print the square of odd list elements on the console 
	 	in the same line with a space
	 	between two consecutive elements. 
	 	
	 */
	public static void printOddsFunctional(List<Integer> l) {
//		l.stream().filter(Utils::checkToBeOdd).map(t->t*t).forEach(t->System.out.print(t + " "));
		l.stream().filter(Utils::checkToBeEven).map(t->t*t).forEach(t->System.out.print(t + " "));

	}
	
	
		/*
	 	5) Functional Programming
	 	Create a method to calculate the sum of the square of even elements
	 */
	public static int sumOfSquaresOfEvens(List<Integer> l) {
		
		int sum = l.stream().filter(Utils::checkToBeEven).distinct().map(Utils::findSquare).reduce(0, Math::addExact);
		
		return sum;
	}
	
		/*
	 	6) Functional Programming
	 	Create a method to calculate the product of the cubes of distinct odd elements
	 */
	
	public static int productOfCubesOfOdds(List<Integer> l) {
		
		int prod = l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::findCube).reduce(1, Math::multiplyExact);
		return prod;
	}
	
	
	
	
	
	
	
	
}
