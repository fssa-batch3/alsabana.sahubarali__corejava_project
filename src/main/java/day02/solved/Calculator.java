package day02.solved;

public class Calculator {
	public String calci(String a, String b) {
		return a + b;
	}

	public int calci(int a, int b) {
		return a + b;
	}

	public double calci(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Calculator cal = new Calculator();
         int add = cal.calci(1, 2);
         String add1= cal.calci("mow","sabin");
         double add2 = cal.calci(2.3, 23.9d);
         
         System.out.println(add);
         System.out.println(add1);
         System.out.println(add2);
	}

}
