package day21accessmodifiersstringbuilders;

public class StringBuilder01 {
	
	/*
	 	To create "mutable Strings" Java created String Builder class. If you create a String
	 	by using String Builder class, the String is going to be "mutable"
	 */

	public static void main(String[] args) {
		
		// to create a StringBuilder:
		
		// 1. way:
		StringBuilder sb1 = new StringBuilder();
		sb1.append("String Builders");
		// append() can be used in method chain
		sb1.append("are").append(" mutable");
		System.out.println(sb1);
		
		// 2. way:
		// If you are sure about the length of String use this way
		// Because it is memory-friendly
		// The capacity of default StringBuilder is 16
		StringBuilder sb2 = new StringBuilder(9);
		sb2.append("JavaJavaJava  1234567890   ");
		System.out.println(sb2);
		System.out.println("Before trim " + sb2.capacity());
		
		
		// trimToSize() removes the area that is not used
		sb2.trimToSize();
		System.out.println("After trim " + sb2.capacity());
		
		
		// 3. way
		StringBuilder sb3 = new StringBuilder("Erdem Cicek");
		sb3.append(" come home", 0, 5);
		System.out.println(sb3);
		
		
		StringBuilder sb4 = new StringBuilder("Erdem");
		System.out.println(sb4.equals("Erdem")); // false
		// StringBuilder equals() works different from Strings
		// In StringBuilder class == sign is used to check equality
		
		StringBuilder sb5 = new StringBuilder("Erdem");
		System.out.println(sb4.equals(sb5)); // false
		
		// to convert StringBuilder to a String
		// toString() : it will not be String permanently, just enables us to use String methods temporarily
		
		System.out.println(sb4.toString().equals(sb5.toString())); // true
		
		// compare  sb4.compareTo(sb5) returns dictonary order differnce as integer
		// insert  sb4.insert(index_to_insert,String_to_be_inserted)
		// replace  sb4.replace(5,8,"String_to_be_replaced")  i.e  ErdemCicek 
//		System.out.println(sb4.replace(5, 11, "ciceque"));
		// reverse  sb4.reverse
//		System.out.println(sb4.reverse());
		// setCharAt(index,char)
//		System.out.println(sb4);
		// subSquence(beginIndex,endIndex)
		System.out.println(sb4.subSequence(2, 5));
//		String s = "Ankara";
//		for ( int i = s.length()-1 ; i >= 0 ; i--) {
//			System.out.print(s.charAt(i));
//		}
		System.out.println();
		String s = sb4.toString();
		String x = sb4.toString();
		System.out.println(s==x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
