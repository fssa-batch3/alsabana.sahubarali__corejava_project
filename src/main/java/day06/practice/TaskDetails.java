package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class TaskDetails {

	private List<Task> taskArray = new ArrayList<Task>();

	public void addTask(String name, int priority) {
		Task task = new Task(name, priority);
		taskArray.add(task);

	}

	public void printTask() {
		for (Task t : taskArray) {
			System.out.println(t.getName() + " " + t.getPriority());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskDetails s = new TaskDetails();
		s.addTask("HTML", 0);
		s.addTask("java", 1);
		s.printTask();

	}

}
