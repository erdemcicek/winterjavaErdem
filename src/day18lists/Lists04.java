package day18lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists04 {
	// create a method to increase every element of the given list by 3

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int n = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for ( int i = 0 ; i<n; i++) {
			int a = scan.nextInt();
			list.add(a);
		}
		scan.close();
		increaseBy3(list);
	}
	public static void increaseBy3(List<Integer> list) {
		for ( int i = 0 ; i < list.size(); i++) {
			list.set(i, list.get(i) + 3);
		}
		System.out.println(list);
	}

}
