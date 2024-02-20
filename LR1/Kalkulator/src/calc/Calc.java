package calc;
import calc.Calculator;


public class Calc{
	public static void main(String[] args){
		System.out.println("Hello World!");
		Calculator calc = new Calculator();
		System.out.println("1 + 2 + 3 = " + calc.sum(1, 2, 3));
		System.out.println("15 - 7 - 6 = " + calc.diff(15, 7, 6));
		System.out.println("2 * 3 * 4 = " + calc.mult(2, 3, 4));
		System.out.println("7 / 2 / 1 / 5 = " + calc.div(7,2,1,5));
		System.out.println("235 << 1 = "+calc.drift(235));
		System.out.println(Integer.toBinaryString(235));
		System.out.println(Integer.toBinaryString(calc.drift(235)));
		
	}
}





