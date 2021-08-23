package practiseproblems;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		System.out.println(DaysInMonth(date));
	}
public static int DaysInMonth(String date) {
String arr[]=date.split("-");
int days=0;
//String month[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
int N=Integer.parseInt(arr[1]);
int Y=Integer.parseInt(arr[2]);
if(N<7) {
	if(N%2==0) {
		if(N==2) {
			if(Y%4==0 || Y%100==0 || Y%400==0) 
				days=29;
			else
				days=28;
			}
			else
				days=30;
		}
		else
			days=31;
	}
	else {
		if(N%2==0) 
			days=31; 
		else
			days=30;	
		}
return days;
}
}
