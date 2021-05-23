package day29abstractclass;

public class Runner {
	
	/*
	 		1) throw is typed inside method body,
	 			throws is typed between the method parenthesis and curly braces
	 		2) when we use "throws" , we shouldn't use "new" keyword ; just the name of the exception is enough
	 		
	 */

	public static void main(String[] args) {
		
		ElementarySchoolCalculator elStudent = new ElementarySchoolCalculator();
		System.out.println(elStudent.add(2,3,4)); // 9
		
		HighSchoolCalculator hsStudent = new HighSchoolCalculator();
		System.out.println(hsStudent.division(12, 3)); // 4

	}

}

/*
	Abstract classes may or may not concrete methods
	
	
	
	
	
	

*/