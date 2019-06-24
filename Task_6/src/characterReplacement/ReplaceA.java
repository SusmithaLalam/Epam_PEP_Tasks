package characterReplacement;

import java.util.Scanner;

public class ReplaceA {
	public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.next();
	   String k=s.substring(0, 1).replace("A","");
	   k+=s.substring(1, 2).replace("A","");
	   k+=s.substring(2);
	   System.out.println(k);
	}
}
