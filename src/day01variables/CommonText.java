package day01variables;

import java.util.Scanner;

public class CommonText {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enten 2 Strings");
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        String longs=s1;
        String shorts=s2;
        String cont="";
        
        int k=0,l=1,start=0,minus=0;
        if(s1.length()<s2.length()) {
            longs=s2;
            shorts=s1;
        }
        for (int i = 0; i <longs.length(); i++) {
            l=0;
            if(minus==shorts.length() || k>longs.length()-1) break;
            for (int j = 0; j < shorts.length(); j++) {
                if(l==1) k=i;
                if(shorts.charAt(j)==longs.charAt(k)) {
                    cont+=shorts.charAt(j);
                    k++;
                    l=0;
                    
                } else l=1;
                if(minus<cont.length()) {
                    minus=cont.length();
                    start=k-minus;
                }
                if(minus==shorts.length() || k>longs.length()-1) break;
            }
            cont="";
            
        }
        System.out.println(minus+" "+longs.substring(start,start+minus).replace(" ", "*"));
    
        
            
        
        scan.close();
    }
}


