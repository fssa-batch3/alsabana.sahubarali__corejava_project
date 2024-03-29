package day03.practice;

import org.junit.jupiter.api.Test;

import day03.solved.*;

 class TestAccount2 {
	@Test
	void AccountTest() {

		// create Account using Setter methods and Default constructor
		Account2 acct1 = new Account2();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);

		System.out.println(acct1.getAccNo() + "-" + acct1.getName() + "-" + acct1.getBalance());

		// Create Account with Overloaded constructor accepting parameters
		Account2 acct2 = new Account2("A102", "Arun", 1000);
		System.out.println(acct2.getAccNo() + "-" + acct2.getName() + "-" + acct2.getBalance());

	}
}