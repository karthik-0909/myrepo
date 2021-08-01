package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(AnagramCheck(str1,str2));
	}
	public static boolean AnagramCheck(String str1, String str2) {
		boolean b =false;
		char a[]=str1.replace(" ", "").toLowerCase().toCharArray();
		char a1[]=str2.replace(" ","").toLowerCase().toCharArray();
		if (a.length==a1.length) {
			Arrays.sort(a);
			Arrays.sort(a1);
			if(Arrays.equals(a, a1)) {
				b=true;
			}
		}
			return b;
	}
}
