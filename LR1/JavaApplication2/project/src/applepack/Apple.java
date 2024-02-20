package applepack;

public class Apple{
	private float mass;
	
	public Apple(){
		this.mass = 0;
	}
	
	public Apple(int mass){
		this.mass = mass;
	}
	
	public void setMass(int mass){
		this.mass = mass;
	}
	
	public float getMass(){
		return this.mass;
	}
	
}