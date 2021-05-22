package day20passbyvaluepassbyreferencedate;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		
//		int price = 100;
		
//		System.out.println(discount(price));
//		System.out.println(price);
//		int[] arr = {1,2,3};
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(dis(arr)));
//		System.out.println(Arrays.toString(arr));
//		String str = "Java";
//		System.out.println(concatenate(str));
//		System.out.println(str);
//		
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		System.out.println(list);
//		System.out.println(updateList(list));
//		System.out.println(list);
		
		String a = "Java";// Java comes to Heap memory and checks if there is any String whose value is "Java"
		String b = "Java";// So if there is the same String Java uses it. Both object and references will be same then.
		String c = new String("Java");// When Java see "new" keyword it does not check if there is already the same String
		System.out.println(a + " - " + b + " - " + " - " + c);
		System.out.println(a==b);// true
		System.out.println(a==c);// false
		System.out.println(a.equals(c));// true  --> equals just checks references
		Scanner scan = new Scanner(System.in);
		String d = scan.next();
		System.out.println(d==a);// I really got false when I typed "Java"
		scan.close();
		
		// if you use Scanner, which means you get input from user; even if input and a given String are the same
		// == sign would give false. Because when you use Scanner Java automatically create another memory on Heap
		// Since they would have different objects, == would return false
	}
	public static int[] dis(int[] arr) {
		for ( int i = 0 ; i < arr.length ; i++) {
			arr[i] *= 2;
		}
		return arr;
	}
	public static int discount(int price) {
		price = price - 10 ;
		return price;
	}
	
	public static String concatenate(String str) {
		str = str + "X";
		return str;
	}
	public static List<Integer> updateList(List<Integer> list){
		for ( int i = 0 ; i<list.size(); i++) {
			list.set(i, list.get(i)*2);
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
