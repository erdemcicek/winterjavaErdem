package day18lists;

import day21accessmodifiersstringbuilders.AccessModifiers01;

public class AccesModifiers03 extends AccessModifiers01{

	public static void main(String[] args) {
		
		AccesModifiers03 obj = new AccesModifiers03();
		System.out.println(obj.protectedString);
		System.out.println(obj.publicString);
		obj.protectedMethod();
	}

}
