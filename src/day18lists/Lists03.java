package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
	// From an integer list find the closest two elements (take list elements from user)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for ( int i = 0 ; i < n ; i++) {
			int a = scan.nextInt();
			list.add(a);
		}
		Collections.sort(list);
		int min = Integer.MAX_VALUE, dif = 0, num1 = 0, num2 = 0;
		for ( int i = 0 ; i < list.size()-1 ; i++) {
			dif = list.get(i+1) - list.get(i);
			if ( min > dif ) {
				min = dif;
				num1 = list.get(i);
				num2 = list.get(i+1);
			}	
		}
		System.out.println("The difference is: " + min + ", num1 is: " + num1 + " ,num2 is: " + num2);
		scan.close();

	}

}
