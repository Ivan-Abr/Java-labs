package calc;
import calc.operation.Adder;
import calc.operation.Subtractor;
import calc.operation.Multiplier;
import calc.operation.Divider;
import calc.operation.LeftDrift;


public class Calculator{
	public int sum(int... a){
		Adder adder = new Adder();
		for (int i: a){
			adder.add(i);
		}
		return adder.getSum();
	}
	
	public int diff(int... a){
		Subtractor subtractor = new Subtractor();
		for (int i = 1; i < a.length; ++i){
			subtractor.sub(a[i]);
		}
		return subtractor.getDiff();
	}
	
	public int mult(int... a){
		Multiplier multiplier = new Multiplier(a[0]);
		for (int i = 1; i < a.length; ++i){
			multiplier.mult(a[i]);
		}
		return multiplier.getProd();
		
	}
	
	public double div(int... a){
		Divider divider = new Divider(a[0]);
		for (int i = 1; i < a.length; ++i){
			divider.div(a[i]);
		}
		return divider.getDiv();	
	}
	
	public int drift(int a){
		LeftDrift leftDrift  = new LeftDrift();
		leftDrift.leftdr(a);
		return leftDrift.getDrift();
	}
	
	
}






