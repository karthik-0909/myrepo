package week2;

public class ExceptionsDemo {
	public static void main(String args[]) {
		int x=9;
		int y=3;
		int r=0;
		try {
			r=x/y;
			String s=null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("num cannot be divided by zero");
		}
		catch(NullPointerException e){
			System.out.println("Value of string must not be empty");
		}
		
		System.out.println(r);
	}
	

}
