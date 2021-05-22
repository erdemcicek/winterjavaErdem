package day14constructorsstatickeywordarrays;

public class MyConstructor {
//	String v = "a";
//	MyConstructor(){
//		v = v + "b";
//	}
//	MyConstructor(String c){
////		this.v = v;  // I'm confused. What is the functionality of "this"??? 
//		v += "f";
//	}
	int x = 5;
	MyConstructor(){
		System.out.println("-x" + x);
	}
	MyConstructor(int x){
		this();
		System.out.println("-x" + x);
	}
	public static void main(String[] args) {
//		MyConstructor mc1 = new MyConstructor("r");
//		MyConstructor mc2 = new MyConstructor();
//		System.out.println(mc1.v);
//		System.out.println(mc2.v);
//		MyConstructor mc1 = new MyConstructor(4);
//		MyConstructor mc2 = new MyConstructor();
//		System.out.println(mc2.x);
//		MyConstructor mc3 = new MyConstructor("33");
//		System.out.println(mc3.x);
	}
	MyConstructor(String c){
		this(6);
		this.x = Integer.parseInt(c);
		System.out.println(this.x * 2);
	}
	
	
	

}
