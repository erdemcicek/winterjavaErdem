package day02scanner;

public class TypeCasting01 {
	
	/*
	 byte < short < int < long < float < double
	 */

	public static void main(String[] args) {
		
		// Auto-widening: If you assign a small data to a large data type, type casting
		// is done automatically by Java.
		byte b1 = 112;
		int i1 = b1;
		System.out.println(b1);
		System.out.println(i1);
		
		// Explicit Narrowing: If you assign a large data type to a small data type,
		// type casting cannot be done by Java automatically. 
		// You should take the responsibility and type the casting explicitly.
		
		int i2 = 1111;
		byte s1 = (byte) i2;
		System.out.println(s1);
		
		// There are two issues:
		// 1) about the memory of data type
		// 2) about the intervals of data type
		// even if you assign an integer whose value is 1 to a byte data type, you get an 
		// error. It's not the interval of byte, but it's about the memory of data type.
		// If you do that by doing explicit type-casting everything is fine.
		// However, if you do explicit type-casting and exceed the interval of the data
		// type, the code would run. But you'd have a wrong value.
		
		//float f1 = 2.3f;
		//float f2 = (float) 2.2;
		
		// If you use explicit narrowing with the numbers which are not in the interval
		// then you will get wrong results. The result will be calculated according to
		// the modulus operation.
		
		int i3 = 5;
		int i4 = 2;
		System.out.println(i3 / i4);
		
		

	}

}
