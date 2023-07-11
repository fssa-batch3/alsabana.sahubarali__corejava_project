package day02.practice;

public class Logger {
	public String debug(String msg) {
		System.out.println("DEBUG: " + msg);
		return msg;
	}

	public String info(String msg) {
		System.out.println("info : " + msg);
		return msg;
	}

	public String error(String msg) {
		System.out.println("error: " + msg);
		return msg;
	}

	public int debug(int num) {
		System.out.println("error: " + num);
		return num;
	}

	public static void main(String[] args) {

		Logger log = new Logger();
		log.debug("Please change this line");
		log.info("update this code");
		log.error("ArithmeticException");
		log.debug(404);

	}
}