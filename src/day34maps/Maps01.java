package day34maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		
		hm1.put("cat", 3);
		hm1.put("caterpillar", 11);
		hm1.put("lion", 4);
		hm1.put("tiger", 5);
		hm1.put("tiger", 15);
		
		System.out.println(hm1.keySet());
		System.out.println(hm1.values());
		
		System.out.println(hm1.containsKey("cat"));// true
		System.out.println(hm1.containsValue(3));  // true
		
		System.out.println(hm1.entrySet());
		
		// equals() does not check the order of elements
		
//		System.out.println(hm1.get("tig").equals(null)); this gave error
//		System.out.println(hm1);
		
		System.out.println(hm1.getOrDefault("cat", 404));
		System.out.println(hm1.getOrDefault("snake", 504));
		System.out.println(hm1.getOrDefault("wolf", 334));
		
		// If you send existing key value into a map, map overwrites, it means
		// updates the value
		
		
		// compute() method is used to update value of a specific key
		// by using compute() method, you cannot update the key
		hm1.compute("lion", (key,value)->value+5);
		
		
		// If you use compute() method with a non-existing key, you will get "NullPointerException"
		hm1.computeIfPresent("caterpillar", (key, value)->value+9);
		
		System.out.println(hm1);
		
//		System.out.println(hm1.computeIfPresent("caterpillaraa", (key, value)->value+9));
		// this line returned "null" ; because there is no such key
		
		// computeIfAbsent() executed if the key does not exist
		// if the key exists it does not change anything
		hm1.computeIfAbsent("fox", k -> 5);
		
		System.out.println(hm1);
		
		
		hm1.compute("tiger", (key, value)->value=555);
		
		
		
	}
}
