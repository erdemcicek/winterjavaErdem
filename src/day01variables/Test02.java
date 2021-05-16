package day01variables;

public class Test02 {
	static {
		System.out.println("Hello");
	}
	

	public static void main(String[] args) {
//		for ( int i = 0 ; i < args.length ; i++) {
//			System.out.println(args[i]);
//		}
		String[] s = {"Erdem","Solidbyte"};
		for ( int i = 0 ; i < args.length ; i++) {
			System.out.println("hello");
		}
		System.out.println(addInt(1,2) + addInt(4,5));
//		System.out.println(add("a","b")+ add("c","d"));
//		declare("ab");
//		System.out.println(declare("ab"));
//		add("solid","byte");
		add("A","B");
//		main(s);
		
	}
	public static void add(String a , String b) {
		System.out.println("We do not use parameters");
	}
//	public static void declare(String s) {
//		System.out.println(s);
//	}
	public static int addInt(int a, int b) {
		return a+b;
	}

}
