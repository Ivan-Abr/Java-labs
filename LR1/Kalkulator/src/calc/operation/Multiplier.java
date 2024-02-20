package calc.operation;

public class Multiplier{
	private int mult;
	
	public Multiplier(int a){
		this.mult = a;
	}
	
	public void mult(int b){
		this.mult *=b;
	}
	
	public int getProd(){
		return mult;
	}
	
	
}
