package ex1;

import java.util.Scanner;

public class Stringmethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		domainName(s);
	}		
	public static void domainName(String s) {
		String str[] = s.split("/");
		//System.out.println(Arrays.toString(str));
		System.out.println("DomainName : " +str[2]);
	}	
}
