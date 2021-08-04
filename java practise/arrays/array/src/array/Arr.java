package array;
import java.util.*;
public class Arr {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int arr1[]=new int[num];
		for (int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int k=0;
		arr1[0]=arr[0];
		//another method  
/*		for (int j=0;j<num-1;j++) {
			if (j<num) {
				if(arr[j]==arr[j+1]) {
					continue;
				}
				else {
					arr1[k]=arr[j];
					k++; 
					}
			}
			else {
				if(arr[j]==arr[j-1]) {
					continue;
				}
				else {
					arr1[k]=arr[j];
					k++; 
					}
				}	
			}*/
		for(int i=1;i<num;i++) {
			if(Arrays.binarySearch(arr1,arr[i])>-1) {
				continue;
			}
			else {
				arr1[k++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
