package day03wrapperclassconcatenatelogicaloperators;

public class Concatenation01 {
	// It joints two or more strings
	 

	public static void main(String[] args) {
		String s = "Java ";
		String t = "is easy";
		System.out.println(s + t);
		
		int a = 3;
		int b = 4;
		//String s1 = "Java";
		System.out.println("" + a + b);
		
		int d = 2;
		int e = 3;
		String f = "Java";
		System.out.println((e*d) + "" + (e-d) + f + (d-e));
		// More effective way :  ((d*e) + ((e-d) + f) + (d-e))

	}

}
