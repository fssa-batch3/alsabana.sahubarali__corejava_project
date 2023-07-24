package day08.practice;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import day08.practice.ListOfEmployees;

public class EmployeeTest {

	@Test
	void TestEmployee() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a comma separated list of DeptName, EmployeeName");
		String str = scan.nextLine();
		scan.close();

		ListOfEmployees names = new ListOfEmployees();

		System.out.println("The list of employees");

		System.out.println(names.list(str));

	}
}
