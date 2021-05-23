package day32collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections03 {
	
	/*
	 		Create a collection which has sorted unique elements...
	 		1.way: Use TreeSet directly but this way will be very slow
	 		2.way: Use HashSet to create Collection, then convert HashSet to TreeSet to put elements in order
	 */

	public static void main(String[] args) {
		
		//1.Way
		long start1 = System.currentTimeMillis();
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		for ( int i = 0 ; i < 10000 ; i++) {
			ts1.add(2*i);
		}
		System.out.println(ts1.size());
		long end1 = System.currentTimeMillis();

		System.out.println(end1-start1); // 20
		
		// 2.Way
		long start2 = System.currentTimeMillis();
		
		HashSet<Integer> hs1 = new HashSet<>();
		
		for ( int i = 0 ; i < 10000 ; i++) {
			hs1.add(2*i);
		}
		TreeSet<Integer> ths = new TreeSet<>(hs1);
		System.out.println(hs1.size());
		
		long end2 = System.currentTimeMillis();
		
		System.out.println(end2-start2); // 7
		
		/*
		 		Basic Table Operations
		 		Constraints
		 		SubQueries
		 		In-Between-Exists
		 		Like(with Wildcards)
		 		GroupBy-Having
		 		Set Operations
		 		Join(Inner,Left,Right etc)
		 		Changing Table Structure
		 		
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
