package ex1;

public class Calc {
	private int x;
	private int y;
	private int z;
	
	public Calc(String name) {
		System.out.println(name);
		}
	public Calc(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Calc(int x,int y,int z) {
		this(x,y);
		this.z=z;
	}
	public int add() {
		return x+y;
	}
	public int sub() {
		return x-y;
	}
	public int mul() {
		return x*y;
	}
	public int add3() {
		return x+y+z;
	}
}
