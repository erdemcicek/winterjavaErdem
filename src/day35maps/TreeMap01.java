package day35maps;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMap01 {
	
	/*
	 		TreeMap puts elements in natural order.
	 		TreeMap uses "keys" to put elements in natural order.
	 		Treemap is not thread-safe, and is not "syncronized".
	 		Treemap allows to use null in values many times, but does not allow you to use null in "keys"
	 		Treemap is slow
	 */

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(12, "Ali Can");
		tm.put(13, "Veli Han");
		tm.put(21, "Mary Star");
		tm.put(123, "Tom Hanks");
		tm.put(4, "Angie Moon");
		
//		System.out.println(tm);
		System.out.println(tm.ceilingEntry(13));// it returns the first element after the key 
												// if you use existing key, it returns the element whose key is same with you've used
												// if you use key more than the greatest one it returns "null"
		
		
		tm.ceilingKey(124);// null
		
		System.out.println(tm.descendingKeySet()); // 123,21,13,12,4
		
		System.out.println(tm.firstEntry()); // 4 = Angie Moon
		
		System.out.println(tm.floorEntry(15)); // 13 = Veli Han
		
		System.out.println(tm.floorKey(9)); // 4
		
		System.out.println(tm.headMap(13)); // {4=Angie Moon, 12=Ali Can}					// for headMap it makes it exclusive
		
		System.out.println(tm.tailMap(13)); // {13=Veli Han, 21=Mary Star, 123=Tom Hanks}  // for tailMap it makes it inclusive
		
		System.out.println(tm.headMap(13, true)); // {4=Angie Moon, 12=Ali Can, 13=Veli Han} // it made 13 inclusive
		
		
	}
}
