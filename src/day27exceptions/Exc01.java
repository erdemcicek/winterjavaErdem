package day27exceptions;

public class Exc01 {

	public static void main(String[] args) {
		
		// Checked    --> Compile Time : filenotfound , IO (input output) ,
		// Unchecked  --> Run Time   : OutOfBound , 
		
		String s1 = "";
		
		System.out.println(s1.length()); // 0
		
		String s2 = null;
		
//		System.out.println(s2.length()); // NullPointerException: If you try to do inappropriate actions with a "null" object
										 // 					  you will get "NullPointerException"
										 // NullPointerException is a Run Time Exception
		
		int[] arr = {2,5,1,9};
//		System.out.println(arr[4]); // ArrayIndexOutOfBoundsException : for non-existing indexes in arrays,
									// 								    you'll get ArrayIndexOutOfBoundsException
									// ArrayIndexOutOfBoundsException is a Run Time Exception
		
		Object i = 70;
//		String s = (String) i; // ClassCastException : If a data type cannot be cast to another data type you'll get
									// 			    ClassCastException
		//						ClassCastException is a "Run Time Exception"
		
		
		
		int a = Integer.parseInt("123");
		System.out.println(a + 2);
		
		int b = Integer.parseInt("abc");
		System.out.println(b + 2); // NumberFormatException 
		
		
		
		
		
		
		
		
		
		

	}

}
