package day03wrapperclassconcatenatelogicaloperators;

public class WrapperClass01 {
	/*
	 What is wrapper class : Java created some objects whose values are coming from
	 primitives data types but the objects have methods as well. 
	 Wrapper for boolean ==> Boolean
	 Wrapper for char    ==> Character *** full word
	 Wrapper for byte    ==> Byte
	 Wrapper for short   ==> Short
	 Wrapper for int     ==> Integer   *** full word
	 Wrapper for long    ==> Long
	 Wrapper for float   ==> Float
	 Wrapper for double  ==> Double 
	 
	 */

	public static void main(String[] args) {
		Integer i = 12;
		Short s = (short)Long.MAX_VALUE;
		
		
		// Find the minimum and maximum value of byte data type:
		
		Byte b = Byte.MAX_VALUE;
		Byte c = Byte.MIN_VALUE;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		System.out.println(i);

	}

}
