package day19foreachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop02 {
	/*
	 	Ask user to enter 5 full names
	 	Get the initials of the first and the last name, concatenate them and store in a list
	 	Print the list on the console
	 	Example ; if user enters "Ali Can", "Veli Han", "Kemal Mert" == > [AC,VH,KM]
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> names = new ArrayList<>();
		
		int i = 0;
		
		do {
			System.out.println("Enter a full name");
			names.add(scan.nextLine());
			i++;
		}while(i<5);
		
		System.out.println(names);
		
		List<String> initials = new ArrayList<>();
		
		for ( String w : names) {
			initials.add(w.substring(0,1) + w.substring(w.indexOf(" ")+1,w.indexOf(" ") + 2));
		}
		System.out.println(initials);
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
