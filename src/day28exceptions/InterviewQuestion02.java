package day28exceptions;

public class InterviewQuestion02 {
	
	// 	create a method a method to return non-repeated element/s 
	// [3,2,5,5,1,3,1]   ==> [2]
	//  3255131
	
	public static void main(String[] args) {
		
		int[] arr = {48,2,0,9,57,5,1,35,35,95};
		noRepeat(arr);
		

	}
	public static void noRepeat( int[] a){
		
		String s1 = "", s2 = "";
		for ( int w : a) {
			s1 += w + ","; // 48,2,0,9,57,5,1
		}				//    ["48","2"				erdem indexOf() != lastIndexOf()
		String[] arr = s1.split(",");
		// "48" --> 48
		for ( int i = 0 ; i < arr.length ; i++) { // 0-127
			if ( arr[i].length() == 2) { // two digits --> char   0,2,0,  		// 0-9    48-57   0 (48  --> k )
				if ( Integer.parseInt(arr[i]) > 47 && Integer.parseInt(arr[i]) < 58) // [48,57]
					arr[i] = "" + (char)(Integer.parseInt(arr[i]) + 53) ; // 48 -> 101   57 -> 110   [101,110]
				// I added 53 to avoid confusion. Otherwise; if arr[i] = 48 , then this if block will turn it into '0'
				// Because the ascii value of '0' is 48. The same goes for the numbers between 48 and 57 
				// which represent ascii values of digits
				else 
					arr[i] = "" + (char)(Integer.parseInt(arr[i])); 
				// With this if-else block I'll be able to make two digits a character in a String.
				// And by using indexOf and lastIndexOf I'll be able to detect and print the ones that occur just once.
			}	
		}
		for ( String w : arr) {  
			s2 += w;
		}
//		System.out.println(s2);
		
		for ( int i = 0 ; i < s2.length() ; i++) {
			if ( (s2.indexOf(s2.charAt(i)) == s2.lastIndexOf(s2.charAt(i))) ) { // 101,110	
				if ( s2.charAt(i) < 111 && s2.charAt(i) > 100) 			// Now I'm turning them into their previous int values
					System.out.print((int)(s2.charAt(i) - 53) + " ");   // At first I'd added 53, while printing I substract 53
				else if ( Character.isDigit(s2.charAt(i))) 
					System.out.print(s2.charAt(i) + " ");
				else 
					System.out.print((int)(s2.charAt(i)) + " ");
			}
		}
	}
}
//if ( s2.charAt(i+1) == '*') System.out.print((int)(s2.charAt(i)) + " ");
//else if ( Character.isDigit(s2.charAt(i))) System.out.print(s2.charAt(i) + " ");
//else System.out.print((int)(s2.charAt(i)) + " ");
//if (( s2.charAt(i+1) == '*') || !Character.isDigit(s2.charAt(i)) ) System.out.print((int)(s2.charAt(i)) + " ");
//else System.out.print(s2.charAt(i) + " ");