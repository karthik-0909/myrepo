package ex1;

public class Demo1 {

	public static void main(String[] args) {
		Calc obj=new Calc("java");
		obj= new Calc(5,6);
		obj=new Calc(1,2,3);
		System.out.println(obj.add3());
		System.out.println(obj.sub());
		System.out.println(obj.mul());
		
	}

}
 