package day34maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MapQuestion02 {

	public static void main(String[] args) {
		System.out.println(getNonRepeatedChars("Hellooo"));
		
	}
	public static List<String> getNonRepeatedChars(String s){
		
		String[] arr = s.split("");
		List<String> list = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for ( String w : arr) {
			map.computeIfPresent(w, (key, value)->value+1);
			map.computeIfAbsent(w, k->1);
		}
		
		for ( Entry<String, Integer> w: map.entrySet()) {
			
			if ( w.getValue() == 1) {
				list.add(w.getKey());
			}
		}
		
		return list;
		
	}
}

