package day09.practice;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import day09.practice.Task;

import org.junit.jupiter.api.Test;

class PracticeTestTask {
	
	@Test
	void test() {

		LocalDate deadline1 = LocalDate.parse("2011-10-20");
		LocalDate deadline2 = LocalDate.parse("2011-01-22");
		LocalDate deadline3 = LocalDate.parse("2011-05-05");

		Task t1 = new Task("Alsabana", 2, deadline1);
		Task t2 = new Task("sabana", 9, deadline2);
		Task t3 = new Task("sabin", 4, deadline3);

		ArrayList<Task> task = new ArrayList<>();
		task.add(t1);
		task.add(t2);
		task.add(t3);

		Collections.sort(task);
		
		assertEquals(deadline2,task.get(0).getDeadline());
		
		
	}



}
