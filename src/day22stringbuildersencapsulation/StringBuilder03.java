package day22stringbuildersencapsulation;

public class StringBuilder03 {
	
	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("Java");
		sbf.insert(4, "X");
		System.out.println(sbf); // JavaX
		// thread-safe and syncronized and therefore it is slower but has more feature 
		// StringBuffer and StringBuilder use the same methods, just StringBuilder is faster than StringBuffer
		// StirngBuilder is faster than StringBuffer. If you do not need those features you can use StringBuilder
		
		
		/*
		 	String is immutable, because of that when you want to update a String
		 	JVM needs to do many tasks  like creating a new container, putting the updated value into it
		 	then remove the previous String object
		 	
		 	StringBuffer is created to update Strings easily but Java made the StringBuffer
		 	thread-safe and synchronized but that features made the StringBuffer slow. Then
		 	Java created StringBuilder which is not thread-safe and not syncronized.
		 	
		 	
		 	As a result, if you are sure you will not need multi-threading just single threading is enough for you use
		 	StringBuilder when you need to update a String. But if it is possible you will use multithreading use StringBuffer
		 	
		 	
		 */
	}

}
