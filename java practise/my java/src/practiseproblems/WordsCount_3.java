package practiseproblems;
import java.util.Arrays;
import java.util.Scanner;
public class WordsCount_3 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		String arr[]=new String[len];
		for (int i=0;i<len;i++) {
			arr[i]=sc.next();
		}
		int N=sc.nextInt();
		System.out.println(Wordscount(arr,N));	
	}
public static int Wordscount(String arr[],int N) {		
		int count=0;
		int len=arr.length;
		for (int i=0;i<len;i++) {
			if(arr[i].toString().length()==N)
				count++;
		}
		return count;
		//System.out.println(Arrays.toString(arr));
	}

}
