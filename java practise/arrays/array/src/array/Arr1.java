package array;
import java.util.*;
public class Arr1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			StringBuilder sb=new StringBuilder();
			sb.append(arr[i]);
			if(sb.toString().equals(sb.reverse().toString())){
				System.out.println(arr[i]);
			}
		}
		
	}

}
