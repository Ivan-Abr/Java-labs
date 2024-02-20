package calc.operation;

public class Divider {
    private double div;
	
    public Divider(int a) {
		this.div = a;
	}
	
    public void div(int b) {
        this.div /= b;
    }
	
    public double getDiv() {
		return this.div;
	}
}
