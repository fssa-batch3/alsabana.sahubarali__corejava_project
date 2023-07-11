package day02.practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("info : " + msg);
	}
	
	public static void error (String msg) {
		System.out.println("error: " + msg);
	}
	
	public static void debug (int num) {
		System.out.println("error: " + num);
	}
	
	public static void main(String[] args) {
		
		
		debug("Please change this line");
		info("update this code");
		error("ArithmeticException");
		debug(404);
		
		
	}
}