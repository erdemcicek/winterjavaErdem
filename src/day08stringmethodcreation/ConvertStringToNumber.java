package day08stringmethodcreation;

public class ConvertStringToNumber {

	public static void main(String[] args) {
		// How do we convert String to number?
		
		// Add these two numbers
		String s1 = "$12.99" , s2 = "$5.00";
		System.out.println(Double.parseDouble(s1.substring(1)));
		// I could have used replace("$","") to get rid of dollar sign instead of substring method
		
		// parseInt() method converts Strings to Integer if and only if the String is created just with numbers
		// valueOf() method also does the same thing
		System.out.println(Integer.valueOf(s1.substring(1, 3)) + (Integer.valueOf(s2.substring(1, 2))));// 12 + 5
		// valueOf() method can used for all data types

	}

}
