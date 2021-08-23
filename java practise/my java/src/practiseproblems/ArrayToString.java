package practiseproblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ArrayToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> str=new ArrayList<>();
		int N=sc.nextInt();
		for (int i=0;i<N;i++) {
			str.add(sc.next());
		}
		String arr[]=new String[N];
		for (int i=0;i<N;i++) {
			arr[i]=str.get(i);
		}
		//Object[] arr1=str.stream().map(e->e).toArray();
		System.out.println(Arrays.toString(arr));
	}

}
