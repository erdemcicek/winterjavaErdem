package day28exceptions;

public class InterviewQuestion03 {
	
	// Create a method like;
	// "aabbbbaaaad" ==> a2b4a4d1

	public static void main(String[] args) {
		
		System.out.println(occurrence("aabbbbaaaccdddd"));
	}
	public static String occurrence(String s) {
		
		String str = "";
		int count = 1;
		for ( int i = 0 ; i < s.length()-1 ; i++) {
			
			if ( s.charAt(i) == s.charAt(i+1)) {
				count++;
			}
			else {
				str += s.charAt(i) + "" + count;
				count = 1;
			}
			if ( i == s.length()-2) { 
				str += s.charAt(i+1) + "" + count;
			}
		}
		return str;
		// we're unable to print 'd' and its count
	}
}
