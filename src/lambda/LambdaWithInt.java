package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaWithInt {
	
	/*
	 	We learned "structured programming" so far, we will learn "functional programming"
	 	now. "structural programming" focuses on "how to do" and "what to do" but in
	 	"functional programming" we will focus on "what to do"
	 	
	 */
	
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
		l.add(15);
		
		
		printEvensStructured(l);
		System.out.println();
		printEvensFunctional(l);
		System.out.println();
		printOddsFunctional(l);
		System.out.println();
		printDistinctCubeOfOdds(l);
		System.out.println();
		System.out.println(sumOfSquaresOfEvens(l));
		System.out.println(productOfCubesOfOdds(l));
		System.out.println(maxEl(l));
		// is it because Java thinks the list may contain "null" inside for Optional<Integer>  ==> Yes
		System.out.println(minEl1(l)); // Optional[2]
		
	}
	/*
	 	1) Structure Programming
	 	Create a method to print to print the even list elements on the console in the
	 	same line with a space between two consecutive elements.
	 */
	public static void printEvensStructured(List<Integer> l) {
		for (Integer w : l) {
			if (w%2==0) System.out.print(w + " ");
		}
	}
	/*
	 	2) Functional Programming
	 	Create a method to print the even list elements on the console in the same line with a space between
	 	two consecutive elements.
	 */
	
	public static void printEvensFunctional(List<Integer> l) {
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t + " "));
	}
	
	/*
	 	3) Functional Prog
	 	Create a method to print the square of odd list elements on the console in the same line with a space
	 	between two consecutive elements. 
	 	
	 */
	public static void printOddsFunctional(List<Integer> l) {
		l.stream().filter(t->t%2==1).map(t->t*t).forEach(t->System.out.print(t + " "));
	}
	
	/*
	 	4) Create a method to print the cube of distinct odd list elements on the console in the same line
	 	with a space between two consecutive elements
	 */
	public static void printDistinctCubeOfOdds(List<Integer> l) {
		l.stream().filter(t->t%2==1).distinct().map(t->t*t*t).forEach(t->System.out.print(t + " "));
	}
	
	/*
	 	5) Functional Programming
	 	Create a method to calculate the sum of the square of even elements
	 */
	public static int sumOfSquaresOfEvens(List<Integer> l) {
		
		int sum = l.stream().filter(t->t%2==0).distinct().map(t->t*t).reduce(0, (x,y)->x+y);
//		int sum = l.stream().filter(t->t%2==0).distinct().map(t->t*t).reduce(0, Integer::sum);
		
		return sum;
	}
	
	/*
	 	6) Functional Programming
	 	Create a method to calculate the product of the cubes of distinct odd elements
	 */
	
	public static int productOfCubesOfOdds(List<Integer> l) {
		
		int prod = l.stream().distinct().filter(t->t%2==1).map(t->t*t*t).reduce(1, (x,y)->x*y);
		// using "distinct" before "filter" is better 
		return prod;
	}
	
	/*
	 	7) Create a method to calculate the max element in the list
	 */
	public static int maxEl(List<Integer> l) {
		return l.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y ? x : y);
	// in the first turn, x will be assigned MIN_VALUE whereas y will be assigned the first element of the list
		
	}
	
//	public static Optional<Integer> maxEl(List<Integer> l) {
//		return l.stream().reduce((x,y)->x>y ? x : y);
//	// in the first turn, x will be assigned MIN_VALUE whereas y will be assigned the first element of the list
//		
//	}
	
	/*
	 	8) Functional Programming
	 	Create a method to calculate the min element in the list
	 */
	
	public static Optional<Integer> minEl1(List<Integer> l){
		return l.stream().reduce((x,y)->x>y?y:x);
	}
	
	
	
	
	
}
