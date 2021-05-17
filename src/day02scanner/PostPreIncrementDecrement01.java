package day02scanner;

public class PostPreIncrementDecrement01 {
	
	// PostIncrement
	// PreIncrement
	// PostDecrement
	// PreDecrement
	

	public static void main(String[] args) {
		int x = 12;
		
		// PostIncrement: increase at the end of the statement
		System.out.println(x++); // prints 12
		System.out.println(x);   // prints 13

		// PreIncrement means increase before the name of the variable
		System.out.println(++x); // prints 14
		
		// PostDecrement means decrease at the end of the statement
		System.out.println(x--); // prints 14
		System.out.println(x);   // prints 13
		
		// PreDecrement means decrease before the name of the variable
		System.out.println(--x); // prints 12
		
		System.out.println(x++);
		System.out.println(x = x + 1 ); // it would do firstly the assignment


	}

}
