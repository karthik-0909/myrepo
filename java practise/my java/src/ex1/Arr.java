package ex1;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String weblink=scan.nextLine();
		System.out.println(SecureSiteCheck(weblink));
		scan.close();
		}
	public static String SecureSiteCheck(String weblink) {
		String arr[]=weblink.split("/");
		//System.out.println(Arrays.toString(weblink));
		if (arr[0].toString().equals("https:")) {
			return "Secure";
		}
		else {
			return "Not Secure";
		}
	}

}
