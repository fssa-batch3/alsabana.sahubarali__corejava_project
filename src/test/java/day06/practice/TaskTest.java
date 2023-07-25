package day06.practice;

import org.junit.jupiter.api.Test;

import day06.practice.TaskDetails;

public class TaskTest {

	@Test

	void Test1() {
		TaskDetails s = new TaskDetails();
		s.addTask("HTML", 0, 1);
		s.addTask("java", 1, 2);

	}

}
