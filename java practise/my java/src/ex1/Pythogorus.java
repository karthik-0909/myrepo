package ex1;

import java.util.Scanner;
public class Pythogorus {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double adj_side=scan.nextInt();
		double opp_side=scan.nextInt();
		System.out.println(FindHypotenous(adj_side,opp_side));

	}
	public static double FindHypotenous(double adj_side,double opp_side) {
		double hyp=Math.sqrt((adj_side*adj_side)+(opp_side*opp_side));
		return hyp;
	}

}
