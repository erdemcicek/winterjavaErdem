package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUp {
	
	/*
	 int arr[][] = { {-4, -3, -2, -1, 0 ,1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4} };
	  Create a method to store all negative elements in a list then print the list on the console.
	 */
	
	public static void main(String[] args) {
		int arr[][] = { {-4, -3, -2, -1, 0 ,1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4} };
		System.out.println(storeNeg(arr));
		
	}
	public static List<Integer> storeNeg(int[][] arr){
		
		List<Integer> mylist = new ArrayList<>();
	
		Arrays.stream(arr).flatMapToInt(t->Arrays.stream(t)).filter(t->t<0).forEach(t->mylist.add(t));
		
		return mylist;
		
	}
}
