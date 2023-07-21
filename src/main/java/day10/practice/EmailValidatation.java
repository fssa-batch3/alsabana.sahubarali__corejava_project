package day10.practice;

import java.util.regex.Pattern;
import java.util.*;
import day10.solved.ValidationException;

public class EmailValidatation {

	public static void main(String[] args) throws ValidationException {
		// TODO Auto-generated method stub
		System.out.println("Enter Email");
		Scanner scan = new Scanner(System.in);
		String mail = scan.nextLine();
		String email = "sabana@gmail.com";
		String regex = "/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/.";

		boolean isMatch = Pattern.matches(regex, email);

		if (mail.equals(isMatch)) {
			throw new ValidationException("Your email is valid");
		} else {
			throw new ValidationException("The email address is: Invalid");
		}
	}

}
