package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdaWithMethodReferenceString {
	
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
		
//		printStartAEndo(list);
//		sortAccLength(list);
//		printElLengthGreaterThanFive(list);
		System.out.println(removeIfLengthLessThanFive(list));
		
	}
	
	/*
	 	1) Functional Programming
	 	Create a method to print list elements which are starting with "A" in uppercases
	*/
	public static void printStartWithA(List<String> l) {
		l.stream().filter(Utils::startWithA).map(String::toUpperCase).forEach(System.out::println);
	}
	
	
	/*
 		2) Functional Programming
 		Create a method to print list elements which are starting with "A" or ending with "o" in lowercases
	 */
	public static void printStartAEndo(List<String> l) {
		l.stream().filter(t->t.startsWith("A")||t.endsWith("o")).map(String::toLowerCase).forEach(System.out::println);
	}
	
		/*
	 	3) Functional Programming
	 	Create a method to print the elements in uppercases after ordering according to their lengths
	 */
	public static void sortAccLength(List<String> l) {
		l.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
	
		/*
	 	4) Functional Programming
	 	Create a method to remove the element if the length is greater than 5
	 */
	
	public static void printElLengthGreaterThanFive(List<String> l) {
		l.stream().filter(t->t.length()>=5).forEach(System.out::println);
	}
	
	
	/*
	 	5) Functional Programming
	 	Create a method to remove the elements if the length is less than 5
	 	
	 	If you want to use "remove()" methods do not use stream(), work with list directly
	 */
	
	public static List<String> removeIfLengthLessThanFive(List<String> l){
		l.removeIf(t->t.length()<5);
		return l;
	}
	
	
	
	
	
	
	
	
	

}
