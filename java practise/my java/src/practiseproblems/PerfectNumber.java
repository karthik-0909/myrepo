package practiseproblems;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(CheckIfPerfect(N));
	}
public static boolean CheckIfPerfect(int N) { 
		int sum=0;
		boolean b=false;
		for (int i=1;i<N;i++) {
			if (N%i==0)
				sum+=i;
		}
		if(sum==N)
			b=true;
		return b;
	}

}
//page2