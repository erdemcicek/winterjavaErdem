package day32collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections02 {
	
	/*
	 		Hashing Technique: it is a technique to create unique codes for every element in a collection
	 		["A", "B", "A", "C" ]
	 */
	
	/*
	 		1) Set Interface has 3 implementations a) HashSet b) LinkedHashSet c) TreeSet
	 		2) Set means "no duplication"
	 		3) Tree means sorted in "natural order"
	 		4) "natural order" means ascending order for numbers, alphabetical order for characters
	 */
	
	/*
	 		HashSet:
	 		1) HashSet does not put the elements in any order. It puts the elements randomly.
	 		2) HashSet does not contain repeated elements
	 		3) "null" can be used in HashSet just once
	 */
	
	/*
	 		LinkedHashSet: 
	 		1) LinkedHashSet puts the elements in "insertion order"
	 		2) LinkedHashSet does not contain repeated elements
	 		3) "null" can be used in LinkedHashSet just once
	 */
	
	/*
	 		TreeSet:
	 		1) TreeSet puts the elements in "natural order"
	 		2) TreeSet does not contain repeated elements
	 		3) "null" can be used in Treeset just once
	 */
	public static void main(String[] args) {
		
		// By selecting data type as object or by not declaring data type, you can store
		// multiple data type in a Collection
		HashSet<Object> hset = new HashSet<>();
		hset.add("A");
		hset.add("B");
		hset.add(2);
		System.out.println(hset.add('c')); // true
		// If you send same elements into a set, it does not give any error but it does not add repeatedly
		System.out.println(hset.add('c')); // false
		hset.add("c");
		
		hset.add(null); // adds null
		hset.add(null); // does not add second null, because it exists
		
		System.out.println(hset);
		
		
		// LinkedHashSet
		LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();
		
		lhSet.add(33);
		lhSet.add(13);
		lhSet.add(43);
		
		lhSet.add(null);
		
		System.out.println(lhSet);
		
		
		// TreeSet
		TreeSet<Integer> tSet = new TreeSet<>();
		
		tSet.add(12);
		tSet.add(-12);
		tSet.add(32);
		tSet.add(0);
		tSet.add(2);
		
		System.out.println(tSet); // [-12, 0, 2, 12, 32]
		
		
		
		
	}

}
