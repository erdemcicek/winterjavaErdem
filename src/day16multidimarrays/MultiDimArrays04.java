package day16multidimarrays;

public class MultiDimArrays04 {

	public static void main(String[] args) {
		String arr[][] = {{"A","B","V"},{"e","L","f"},{"h","e","r","t"}}; // 0-1, 1,0, 2,1
		// By using arr print Bee on the console
		String s = "";
		for ( int i = 0 ; i < arr.length ; i++) {
			for ( int j = 0 ; j < arr[i].length ; j++) {
				if ( arr[i][j].equals("B")){
					s += arr[i][j];
					break;
				}
				else if (arr[i][j].equals("e")) {
					s += arr[i][j];
					break;
				}
			}
		}
		System.out.println(s);	
	}
}
