package day31interfacecollections;

import java.util.LinkedList;
import java.util.List;

/*
 		Collections are a) List(Interface)   ==> i)ArrayList(Class), ii)LinkedList(Class)
 		  					List<Integer> list = new ArrayList<>();
 		  					List<Integer> list = new LinkedList<>();
 		  					
 						b) Queue(Interface)  ==> i)PriorityQueue(Class), ii)Deque(Interface)
 						
 						c) Set(Interface)    ==> i)HashSet(Class), ii)LinkedHashSet(Class)
 												 iii)SortedSet(Interface) ==> TreeSet(Class)
 */

public class Collections01 {
	
	/*
	 		LinkedList 1) It is a class
	 				   2) It is good at "adding" and "removing elements"
	 				   3) Every element is connected with eachother
	 				   4) Every element has "data" and "pointer" parts
	 				   5) Elements are called as "node"
	 				   6) Every linkedlist has "head" part, "head" has just "pointer" part
	 				   7) Last element is called "tail" in linkedlist, it points "null"
	 				   8) It is not successful in searching elements and updating elements
	 */

	public static void main(String[] args) {
		
		List<String> ll1 = new LinkedList<>();
		
		ll1.add(0, "A");
		ll1.add(0, "B");
		ll1.add(2,"C");
		
		System.out.println(ll1);
		
		
	}
}
