package day09.practice;

import java.time.LocalDate;
import java.util.*;

public class Task implements Comparable<Task> {
	private String name;
	private int id;
	private LocalDate deadline;

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public Task(String name, int id, LocalDate deadline) {
		this.name = name;
		this.id = id;
		this.deadline = deadline;
	}

	public Task() {

	}

	@Override
	public int compareTo(Task o) {

		// return this.deadline.compareTo(o.getDeadline());
		int s = this.deadline.getMonth().compareTo(o.getDeadline().getMonth());
		if (s != 0) {
			return s;
		} else {
			if (this.deadline.getDayOfMonth() > o.getDeadline().getDayOfMonth()) {
				return 1;
			} else {
				return -1;
			}
		}

	}

//	@Override
//	public String toString() {
//		return "Task [name=" + name + ", id=" + id + ", deadline=" + deadline + ", getDeadline()=" + getDeadline()
//				+ ", getName()=" + getName() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		for (Task t : task) {
			System.out.println(" Task Name - " + t.getName() + ", Deadline - " + t.getDeadline());
		}

	}

}
