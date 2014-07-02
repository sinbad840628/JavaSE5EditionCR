package chapter13.javase5.staticimport;

public class Hypot {

	public static void main(String[] args) {
		double side1,side2;
		double hypot;
		side1 = 3.0;
		side2 = 4.0;
		hypot = Math.sqrt( Math.sqrt(side1) + Math.pow(side2, 2));
		System.out.println(hypot);
	}
}
