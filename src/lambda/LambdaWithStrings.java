package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithStrings {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");// 3
		list.add("Mark");// 4
		list.add("Jackson"); // 7
		list.add("Amanda"); // 6
		list.add("Mariano"); // 7
		list.add("Alberto"); // 7
		list.add("Tucker"); // 6
		list.add("Christ"); // 6
		
//		printStartWithA(list);
//		System.out.println();
//		printStartAEndo(list);
//		System.out.println();
//		sortAccLength(list);
//		System.out.println();
//		sortAccLast(list);
//		System.out.println();
//		formatPrint(list);
		
		System.out.println(checkLength(list));    // false
		System.out.println(checkAnyLength(list)); // true
		System.out.println(checkNoLength(list));  // true  for 11
//		System.out.println(checkNoLength(list));  // false  for 7
		
	}

	/*
	 	1) Functional Programming
	 	Create a method to print list elements which are starting with "A" in uppercases
	 */
	public static void printStartWithA(List<String> l) {
		l.stream().filter(t->t.startsWith("A")).forEach(t->System.out.print(t.toUpperCase() + " "));
	}
	
	/*
 	2) Functional Programming
 	Create a method to print list elements which are starting with "A" or ending with "o" in lowercases
 */
	public static void printStartAEndo(List<String> l) {
		l.stream().filter(t->t.startsWith("A")||t.endsWith("o")).forEach(t->System.out.print(t.toLowerCase() + " "));
	}
	
	
	/*
	 	3) Functional Programming
	 	Create a method to print the elements in uppercases after ordering according to their lengths
	 */
	public static void sortAccLength(List<String> l) {
		l.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->-t.length())).forEach(t->System.out.print(t + " "));
		// if I put "-" before "t" inside comparing it makes it reverse order
	}
	
	/*
 	4) Functional Programming
 	Create a method to print the elements in lowercases after ordering according to their last characters
 */
	
	public static void sortAccLast(List<String> l) {
		l.stream().map(t->t.toLowerCase()).sorted(Comparator.comparing(t->-t.charAt(t.length()-1)))
		.forEach(t->System.out.print(t + " "));
	// if I put "-" before "t" inside comparing it makes it reverse order
	}
	
	
	/*
	 	5) Functional Programming
	 	Create a method to print the length of every element in the following format.
	 	Sort by length.	  Ali: 3        Mark: 4       Amanda: 6     etc.
	 */
	
	public static void formatPrint(List<String> l) {
		l.stream().map(t->t + " : " + t.length()).sorted(Comparator.comparing(t->t.length()))
		.forEach(t->System.out.print(t+ " "));
	}
	
	
	/*
	 	6) Functional Programming
	 	Create a method to remove the element if the length is less than 5
	 */
	
	public static void removeLessThanFive(List<String> l) {
		l.stream().filter(t->t.length()>=5).forEach(t->System.out.println());
	}
	
	/*
	 	7) Functional Programming
	 	Create a method to check if the length of all elements 
	 	are greater than 3
	 */
	
	public static boolean checkLength(List<String> l) { 
		return l.stream().allMatch(t->t.length()>3);
	}
	
	/*
	 	8) Functional Programming
	 	Create a method to check if the length of any element is 4
	 */
	
	public static boolean checkAnyLength(List<String> l) {
		return l.stream().anyMatch(t->t.length()==4);
	}
	
	/*
 		9) Functional Programming
 		Create a method to check if no element has length 11
	 */
	
	public static boolean checkNoLength(List<String> l) {
		return l.stream().noneMatch(t->t.length()==11);
	}
	
}
