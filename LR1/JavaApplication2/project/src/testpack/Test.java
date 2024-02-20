package testpack;
import applepack.Apple;

public class Test{
	public static void main(String[] args){
		Apple apple = new Apple();
		apple.setMass(100);
		System.out.println("Apple mass = " + apple.getMass() + "kg");
	}
}