package day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperator01 {
	// Difference between && and & : 

	public static void main(String[] args) {
		System.out.println(7 == 6 + 2);
		//System.out.println(3 != 5 - 2);
		System.out.println(4 > 56);
		System.out.println(1 >= 11);
		System.out.println(6 <= 6);
		System.out.println("-------");
		System.out.println(false & true & true); // checks all even if there is already one false
		//System.out.println(false && true && true); // time-effective
		
		
	}

}
