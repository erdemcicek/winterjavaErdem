package day03wrapperclassconcatenatelogicaloperators;

public class Homeworkday03 {
	// boolean , char , byte , short , int , long , float , double
	/*
	 	When I print c1 , I see "?" on the console. But when I type print(c1+0) , 65535 is displayed.
		Similarly , when I print c2 , I see " " on the console. But when I type print(c2+0) , 0 is shown.
		But the ASCII values of "?" and " " are 63 and 32 respectively.
		So it is Unicode value being shown not ASCII code values  */
	public static void main(String[] args) {
		
		Boolean b1 = Boolean.TRUE;// I think it is logically the maximum value of boolean,
		Boolean b2 = Boolean.FALSE;// And similarly it is the minimum value of it. 
		Character c1 = Character.MAX_VALUE;// When I type (int)Character.MAX_VALUE, 65535 is displayed, which is the Unicode of "?"
		Character c2 = Character.MIN_VALUE; // When I type (int)Character.MIN_VALUE, 0 is displayed, which is the Unicode of " " 
		Byte by1 = Byte.MAX_VALUE;
		Byte by2 = Byte.MIN_VALUE;
		Short s1 = Short.MAX_VALUE;
		Short s2 = Short.MIN_VALUE;
		Integer i1 = Integer.MAX_VALUE;
		Integer i2 = Integer.MIN_VALUE;
		Long l1 = Long.MAX_VALUE;
		Long l2 = Long.MIN_VALUE;
		Float f1 = Float.MAX_VALUE;
		Float f2 = Float.MIN_VALUE;
		Double d1 = Double.MAX_VALUE;
		Double d2 = Double.MIN_VALUE;
		System.out.println(b1 + "\n" + b2 + "\n" + c1 + "\n" + c2 + "\n" + by1 + "\n" + by2 + "\n" + s1 + "\n" + s2 );
		System.out.println(i1 + "\n" + i2 + "\n" + l1 + "\n" + l2 + "\n" + f1 + "\n" + f2 + "\n" + d1 + "\n" + d2);
		
		

	}

}
