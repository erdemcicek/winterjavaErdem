package day08stringmethodcreation;

public class StringMethods01 {

	public static void main(String[] args) {
//		String str1 = "erdem cicek";
		// 19) trim()
		// trim() is used to remove space character JUST from the beginning and from the end of the String
		
//		String str2 = "    Java is Java     ";
//		System.out.println(str2.length());
//		System.out.println(str2.trim().length());
//		System.out.println(str2);
//		System.out.println(str2.trim());
		
		// By using String methods change the String "  Ayse123 kaya/%   " to "Ayse KAYA"
		String str3 = "   Ayse123 kaya/%    ";
		String a = str3.replaceAll("\\W", "");
//		System.out.println(a);
		String b = a.replaceAll("\\d", "");
//		System.out.println(b);
		String c = b.substring(0, 4);
		String d = b.substring(4).toUpperCase();
		String e = c + " " + d;
		System.out.println(e);
		
		// 20) concat() is used to combine Strings
		System.out.println(c.concat(" ").concat(d));
		

	}

}
