package practiseproblems;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		
		System.out.println(CheckArraySeq(arr));

	}
	
public static boolean CheckArraySeq(int arr[]) {
	boolean b=false;
	for(int i=0;i<arr.length;i++) {
		if(i+2<arr.length) {
			if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
				b=true;
		}
	}
	return b;
}

}
