package calc.operation;

public class Subtractor{
	private int diff;
	public Subtractor(){
		this.diff = 0;
	}
	public Subtractor(int a){
		this.diff = a;
	}
	
	public void sub(int b){
		this.diff -=b;
	}
	
	public int getDiff(){
		return diff;
	}
	
	
}