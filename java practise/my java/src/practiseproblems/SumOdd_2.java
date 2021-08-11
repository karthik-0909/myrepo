package practiseproblems;
import java.util.Scanner;

public class SumOdd_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=1;//since 1 is an odd number
		for (int i=2;i<=N;i++) {  //sum is 1 we can start for loop with 2
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
