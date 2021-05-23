package day22stringbuildersencapsulation;

public class StringBuilder01 {
	
	/*
	 	String is immutable, because of that when you want to update a String JVM needs to do many tasks
	 	like removing unused container and put the Strings in new container
	 */
	
	public static void main(String[] args) {
	
		String s = "Java";
		s.concat("x");
		System.out.println(s);// prints Java
		String s1 = s.concat("x"); // prints Javax , because we've assigned concatinated version of it
		System.out.println(s1);
		
		// StringBuffer is created to update String easily but Java made it thread-safe and syncronized
		// That features made StringBuffer slow. Then after Java5, Java Developers created StringBuilder  
		// which is not thread-safe and not synchronized
		// So it is faster than StringBuffers
		StringBuffer sbf = new StringBuffer("Java");
		sbf.append("x");
		System.out.println(sbf); // prints Javax
		
		
		// As a result if you want to work with updated Strings and if you don't need a thread safe functionality
		// use StringBuilders
		StringBuilder sb = new StringBuilder("Java");
		sb.append("x");
		System.out.println(sb); // prints Javax
	}
	
	
	/*
	 	equals() in StringBuilder returns false even the values are same.
	 	Because equals() method is StringBuilder uses "==" in it
	 	
	 	How can we compare the values of StringBuilders?
	 	
	 	1.way --> Convert StringBuilders to String then use equals() method
	 	
	 	2.way --> Use compareTo() method ; If you get "0" be sure StringBuilder values are same.
	 	
	 	
	 */
	
	
	
	
	
	
	
	
	
	
	
}
