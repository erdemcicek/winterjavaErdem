package day33collections;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		// is it like int[2][n] multi-dim array which has more features??
		// keys are unique in Maps
		// keys can have null value just once
		// values can be repeated
		// values can have null values multiple times
		// you cannot use null as keys for HashTable, you can use null once as keys for HashMap
		
		
		/*
		 	1) HashMap puts the elements in random order, because of that it is fast
		 	2) HashMap is not thread-safe that is; HashMap objects cannot be used in 
		 		multi-threading
		 	3) HashMap is "not synchronized" that is; HashMap objects cannot be
		 		synchronized
		 	4) HashMap can have a single "null" in "keys" part
		 	5) HashMap can have multiple "null" values in "values" part
		 */
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Cat", 3);
		hm.put("Caterpillar", 11);
		hm.put("Lion", 4);
		hm.put("Tiger", 5);
		
		System.out.println(hm); // {Cat=3, Lion=4, Caterpillar=11, Tiger=5}
		
		// keySet() returns just keys in Set Collection ( that means no repeatition )
		System.out.println(hm.keySet()); // [Cat, Lion, Caterpillar, Tiger]
		
		// values() returns all values in Collection ( that means repeatition is allowed )
		System.out.println(hm.values()); // [3, 4, 11, 5]
		
	}
}
