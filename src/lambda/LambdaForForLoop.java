package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaForForLoop {
	
	/*
	 	Print all integers from 1 to 100 without loop
	 */
	
	public static void main(String[] args) {
		
//		printFromAToB(1, 100);
//		printFromAToBFunc(1, 100);
//		System.out.println(findSum(3, 98));
//		System.out.println(findEvenSum(3, 98));
//		System.out.println(findMult(3, 11));
//		System.out.println(findFactorial(9)); // 120*6*7*8*9
//		System.out.println(120*42*72);
//		System.out.println(findEvenMult1(7));
//		System.out.println(findEvenMult2(7));
//		System.out.println(findSumOfOdd(23)); // 529
//		System.out.println(findFirst5OddMult(5));
		System.out.println(IntStream.rangeClosed(1, 3).reduce(1, Math::multiplyExact));
		
		
	}
	
	public static void printFromAToB(int start, int end) {
		System.out.print(start + " ");
		start++;
		if ( start < 101) printFromAToB(start, end);
			
	}
	
	// Functional Programming
	// in range() method second parameter is exclusive
	// in rangeClosed() method first and second parameters are inclusive
	public static void printFromAToBFunc(int start, int end) {
//		IntStream.range(start, end+1).forEach(t->System.out.print(t + " "));
		IntStream.rangeClosed(start, end).forEach(t->System.out.print(t + " "));
	}
	
	// Find the sum of integer from 3 to 98 by using funtional programming
	
	public static int findSum(int a, int b) {
		return IntStream.rangeClosed(a, b).sum();	
	}
	
	// Find the sum of even integer from 3 to 98 
	
	public static int findEvenSum(int a, int b) {
//		return IntStream.rangeClosed(a, b).filter(t->t%2==0).sum();
		return IntStream.rangeClosed(a, b).filter(Utils::checkToBeEven).sum();
	}
	
	// Find the multiplication of odd integers from 3 to 28
	
	public static int findMult(int a, int b) {
		return IntStream.rangeClosed(a, b).filter(Utils::checkToBeOdd).reduce(1, (x,y)->x*y);
//		return IntStream.rangeClosed(a, b).filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);

	}
	
	// Find 9 factorial by using functional programming
	
	public static int findFactorial(int f) {
		return IntStream.rangeClosed(1, f).reduce(1, Math::multiplyExact);
	}
	
	// Find the multiplication of first 7 even counting numbers
	// 1.Way
	public static int findEvenMult1(int f) {
		return IntStream.rangeClosed(1, 2*f).filter(Utils::checkToBeEven).reduce(1, Math::multiplyExact);
	}
	
	// 2.Way
	public static int findEvenMult2(int f) {
		return IntStream.iterate(2, t->t+2).limit(f).reduce(1, Math::multiplyExact);
	}
	
	// Find the sum of the first 23 odd counting numbers
	
	public static int findSumOfOdd(int f) {
		return IntStream.iterate(1, t->t+2).limit(f).sum();
	}
	
	// Find the multiplication of first 5 odd counting numbers which are greater than 6
	
	public static int findFirst5OddMult(int n) {
		return IntStream.iterate(7, t->t+2).limit(n).reduce(1, Math::multiplyExact);
	}
	
}
