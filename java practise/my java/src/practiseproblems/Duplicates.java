package practiseproblems;
import java.util.Scanner;

public class Duplicates {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N1=s.nextInt();
		int N2=s.nextInt();
		int N3=s.nextInt();
		System.out.println(CheckforDuplicates(N1,N2,N3));
		
	}
public static int CheckforDuplicates(int N1,int N2,int N3) {
	int sum=0;
	if (N1==N2) {
		sum+=N3;
	}
	else if(N1==N3)
		sum=N2;
	else if(N2==N3){
		sum=N3;
	}
	else
		sum=N1+N2+N3;

 	return sum;
	}
}