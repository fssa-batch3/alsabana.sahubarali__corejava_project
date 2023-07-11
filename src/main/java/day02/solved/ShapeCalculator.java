package day02.solved;

public class ShapeCalculator {

	public int calculateArea(int l, int b) {
		return l * b;
	}

	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCalculator calc = new ShapeCalculator();
		int result = calc.calculateArea(24, 9);
		double result1 = calc.calculateArea(5);

		System.out.println(result);
		System.out.println(result1);
	}

}
