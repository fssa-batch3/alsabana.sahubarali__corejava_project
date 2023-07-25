package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class TaskDetails {

	private List<Task> taskArray = new ArrayList<Task>();

	public void addTask(String name, int priority,int id) {
		Task task = new Task(name, priority,id);
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
		s.addTask("HTML", 0,1);
		s.addTask("java", 1,1);
		s.printTask();

	}

}
