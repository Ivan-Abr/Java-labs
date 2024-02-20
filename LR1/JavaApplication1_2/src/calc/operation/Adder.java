package calc.operation;

public class Adder{
	private int sum;
	public Adder(){
		this.sum = 0;
	}
	public Adder(int a){
		this.sum = a;
	}
	
	public void add(int b){
		this.sum +=b;
	}
	
	public int getSum(){
		return sum;
	}
	
	
}