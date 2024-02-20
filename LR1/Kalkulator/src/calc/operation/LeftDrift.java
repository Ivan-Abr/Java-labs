package calc.operation;

public class LeftDrift{
	private int leftdr;
	
	public LeftDrift(){
		this.leftdr = 0;
	}
	
	public void leftdr(int d){
		this.leftdr = d<<1;
	}
	
	public int getDrift(){
		return this.leftdr;
	}
	

}