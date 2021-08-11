package practiseproblems;

import java.util.Scanner;

public class Arraymatch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(ArrayMatch(arr));
	}
public static boolean ArrayMatch(int arr[]) {
	int n=arr.length;
	boolean b=false;
		for (int i=0;i<n;i++) {
			if(i+3<n) {
				if(arr[i]==1) {
					if(arr[i+1]==2) {
						if(arr[i+2]==3)
							b=true;
					}
				}
			}
		}
		return b;
	}
}

