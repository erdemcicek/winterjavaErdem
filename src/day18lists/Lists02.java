package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {
	// create a method to delete odd and increase even elements by multiplying 5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for ( int i = 0 ; i < 7 ; i++) {
			list.add(i);
		}
		System.out.println(list);
		updateList(list);

	}
	
	public static void updateList(List<Integer> list){ // 0,2,3,4,5,6
		for ( int i = 0 ; i < list.size() ; i++) {
			if ( list.get(i) % 2 == 0) {
				list.set(i, (list.get(i)*5));
			}
			else {
				list.remove(i);
				i--;  // WOOOW magnificent
			}
				
		}
		System.out.println(list);
	}

}
