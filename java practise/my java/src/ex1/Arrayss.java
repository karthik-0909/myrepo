package ex1;

import java.util.Arrays;

public class Arrayss {
	
	public static void main(String args[]) {
		int arr[]= {3,2,4};
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(arr[1]);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(Arrays.binarySearch(arr, 3));
		
		int arr1[]=Arrays.copyOf(arr, 1);
		System.out.println(Arrays.toString(arr1));
	}

}
