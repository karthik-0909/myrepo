package array;

import java.util.Scanner;

public class Arr2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
		}
		for (int i=0;i<n;i++) {
			int f=0;
			int e=arr[i];
			for(int j=1;j<e;j++) {
				if(arr[i]%j==0) {
					f++;
					}
			}
		if(f==1)
			System.out.println(e);
	}
	}



}
